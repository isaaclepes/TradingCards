-- -------------------------------
-- Alter Table `${prefix}decks`
-- -------------------------------
ALTER TABLE `${prefix}decks`
    ADD series_id VARCHAR(200)
    DEFAULT '${default_series_id}';