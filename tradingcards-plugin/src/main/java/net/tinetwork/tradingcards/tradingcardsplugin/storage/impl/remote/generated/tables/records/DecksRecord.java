/*
 * This file is generated by jOOQ.
 */
package net.tinetwork.tradingcards.tradingcardsplugin.storage.impl.remote.generated.tables.records;


import net.tinetwork.tradingcards.tradingcardsplugin.storage.impl.remote.generated.tables.Decks;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DecksRecord extends UpdatableRecordImpl<DecksRecord> implements Record7<Integer, String, Integer, String, String, Integer, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>minecraft.decks.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>minecraft.decks.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>minecraft.decks.uuid</code>.
     */
    public void setUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>minecraft.decks.uuid</code>.
     */
    public String getUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>minecraft.decks.deck_number</code>.
     */
    public void setDeckNumber(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>minecraft.decks.deck_number</code>.
     */
    public Integer getDeckNumber() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>minecraft.decks.card_id</code>.
     */
    public void setCardId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>minecraft.decks.card_id</code>.
     */
    public String getCardId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>minecraft.decks.rarity_id</code>.
     */
    public void setRarityId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>minecraft.decks.rarity_id</code>.
     */
    public String getRarityId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>minecraft.decks.amount</code>.
     */
    public void setAmount(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>minecraft.decks.amount</code>.
     */
    public Integer getAmount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>minecraft.decks.is_shiny</code>.
     */
    public void setIsShiny(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>minecraft.decks.is_shiny</code>.
     */
    public Byte getIsShiny() {
        return (Byte) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, Integer, String, String, Integer, Byte> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, Integer, String, String, Integer, Byte> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Decks.DECKS.ID;
    }

    @Override
    public Field<String> field2() {
        return Decks.DECKS.UUID;
    }

    @Override
    public Field<Integer> field3() {
        return Decks.DECKS.DECK_NUMBER;
    }

    @Override
    public Field<String> field4() {
        return Decks.DECKS.CARD_ID;
    }

    @Override
    public Field<String> field5() {
        return Decks.DECKS.RARITY_ID;
    }

    @Override
    public Field<Integer> field6() {
        return Decks.DECKS.AMOUNT;
    }

    @Override
    public Field<Byte> field7() {
        return Decks.DECKS.IS_SHINY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUuid();
    }

    @Override
    public Integer component3() {
        return getDeckNumber();
    }

    @Override
    public String component4() {
        return getCardId();
    }

    @Override
    public String component5() {
        return getRarityId();
    }

    @Override
    public Integer component6() {
        return getAmount();
    }

    @Override
    public Byte component7() {
        return getIsShiny();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUuid();
    }

    @Override
    public Integer value3() {
        return getDeckNumber();
    }

    @Override
    public String value4() {
        return getCardId();
    }

    @Override
    public String value5() {
        return getRarityId();
    }

    @Override
    public Integer value6() {
        return getAmount();
    }

    @Override
    public Byte value7() {
        return getIsShiny();
    }

    @Override
    public DecksRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DecksRecord value2(String value) {
        setUuid(value);
        return this;
    }

    @Override
    public DecksRecord value3(Integer value) {
        setDeckNumber(value);
        return this;
    }

    @Override
    public DecksRecord value4(String value) {
        setCardId(value);
        return this;
    }

    @Override
    public DecksRecord value5(String value) {
        setRarityId(value);
        return this;
    }

    @Override
    public DecksRecord value6(Integer value) {
        setAmount(value);
        return this;
    }

    @Override
    public DecksRecord value7(Byte value) {
        setIsShiny(value);
        return this;
    }

    @Override
    public DecksRecord values(Integer value1, String value2, Integer value3, String value4, String value5, Integer value6, Byte value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DecksRecord
     */
    public DecksRecord() {
        super(Decks.DECKS);
    }

    /**
     * Create a detached, initialised DecksRecord
     */
    public DecksRecord(Integer id, String uuid, Integer deckNumber, String cardId, String rarityId, Integer amount, Byte isShiny) {
        super(Decks.DECKS);

        setId(id);
        setUuid(uuid);
        setDeckNumber(deckNumber);
        setCardId(cardId);
        setRarityId(rarityId);
        setAmount(amount);
        setIsShiny(isShiny);
    }
}
