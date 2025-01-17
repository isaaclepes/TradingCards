-- TradingCards MariaDB Schema

CREATE TABLE IF NOT EXISTS `{prefix}decks` (
    id             INT AUTO_INCREMENT NOT NULL,
    uuid           VARCHAR(36)        NOT NULL,
    deck_number    INT                NOT NULL,
    card_id        VARCHAR(200)       NOT NULL,
    rarity_id      VARCHAR(200)       NOT NULL,
    amount         INT                NOT NULL,
    is_shiny       BOOL               NOT NULL,
    PRIMARY KEY (id)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `{prefix}rarities` (
    rarity_id      VARCHAR(200)         NOT NULL,
    display_name   TINYTEXT                     ,
    default_color  VARCHAR(36)                  ,
    buy_price      DOUBLE                       ,
    sell_price     DOUBLE                       ,
    PRIMARY KEY (rarity_id)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `{prefix}rewards` (
    rarity_id      VARCHAR(200)       NOT NULL,
    command        TINYTEXT           NOT NULL,
    command_order  INT                NOT NULL,
    PRIMARY KEY (rarity_id)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `{prefix}series` (
    series_id    VARCHAR(200)                           NOT NULL,
    display_name TINYTEXT                               ,
    series_mode  ENUM('ACTIVE','DISABLED','SCHEDULED')  ,
    PRIMARY KEY (series_id)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `{prefix}series_colors` (
   series_id    VARCHAR(200)       NOT NULL,
   `type`       VARCHAR(10)        NOT NULL,
   info         VARCHAR(10)        NOT NULL,
   about        VARCHAR(10)        NOT NULL,
   rarity       VARCHAR(10)        NOT NULL,
   series       VARCHAR(10)        NOT NULL,
   PRIMARY KEY (series_id)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `{prefix}custom_types` (
    type_id         VARCHAR(200)       NOT NULL,
    display_name    TINYTEXT           ,
    drop_type       ENUM('boss','hostile','neutral','passive','all'),
    PRIMARY KEY (type_id)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `{prefix}packs` (
    pack_id         VARCHAR(200)       NOT NULL,
    display_name    TINYTEXT           ,
    buy_price       DOUBLE             ,
    permission      VARCHAR(200)       ,
    PRIMARY KEY (pack_id)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `{prefix}packs_content` (
    `id`             INT                NOT NULL AUTO_INCREMENT,
    line_number      INT                NOT NULL,
    pack_id          VARCHAR(200)       NOT NULL,
    rarity_id        VARCHAR(200)       NOT NULL,
    card_amount      VARCHAR(200)       NOT NULL,
    series_id        VARCHAR(200)       NOT NULL,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `{prefix}cards` (
    `id`                INT                 NOT NULL AUTO_INCREMENT,
    card_id             VARCHAR(200)        NOT NULL,
    display_name        TINYTEXT,
    rarity_id           VARCHAR(200)        NOT NULL,
    has_shiny           BOOL                        ,
    series_id           VARCHAR(200)        NOT NULL,
    info                TEXT,
    custom_model_data   INT,
    buy_price           DOUBLE,
    sell_price          DOUBLE,
    type_id             VARCHAR(200),
    PRIMARY KEY (`id`)
) DEFAULT CHARSET = utf8mb4;