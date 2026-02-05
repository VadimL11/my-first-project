CREATE EXTENSION IF NOT EXISTS pgcrypto;


CREATE TABLE IF NOT EXISTS customers
(
    id           UUID PRIMARY KEY     DEFAULT gen_random_uuid(),
    name         TEXT        NOT NULL,
    phone_number TEXT        NOT NULL UNIQUE,
    email        TEXT        NOT NULL UNIQUE,
    password     TEXT        NOT NULL,
    created_at   TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at   TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    status       TEXT        NOT NULL
);


CREATE TABLE IF NOT EXISTS admins
(
    id           UUID PRIMARY KEY     DEFAULT gen_random_uuid(),
    name         TEXT        NOT NULL,
    email        TEXT        NOT NULL UNIQUE,
    phone_number TEXT        NOT NULL UNIQUE,
    password     TEXT        NOT NULL,
    role         TEXT        NOT NULL,
    created_at   TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at   TIMESTAMPTZ NOT NULL DEFAULT NOW()
);


CREATE TABLE IF NOT EXISTS cards
(
    id          UUID PRIMARY KEY     DEFAULT gen_random_uuid(),
    customer_id UUID        NOT NULL UNIQUE,
    balance     INT         NOT NULL,
    created_at  TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at  TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    status      TEXT        NOT NULL,

    CONSTRAINT fk_cards_customer
        FOREIGN KEY (customer_id)
            REFERENCES customers (id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE
);


CREATE TABLE IF NOT EXISTS transactions
(
    id         UUID PRIMARY KEY     DEFAULT gen_random_uuid(),
    card_id    UUID        NOT NULL,
    admin_id   UUID        NOT NULL,
    direction  TEXT        NOT NULL,
    amount     INT         NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    status     TEXT        NOT NULL,
    note       TEXT,

    CONSTRAINT fk_transactions_card
        FOREIGN KEY (card_id)
            REFERENCES cards (id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE,

    CONSTRAINT fk_transactions_admin
        FOREIGN KEY (admin_id)
            REFERENCES admins (id)
            ON DELETE RESTRICT
            ON UPDATE CASCADE
);

CREATE INDEX IF NOT EXISTS idx_transactions_card_id ON transactions (card_id);
CREATE INDEX IF NOT EXISTS idx_transactions_admin_id ON transactions (admin_id);

