package salesTransaction.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int AdditionalCharge = 0;
  public static final int Address = 1;
  public static final int Card = 2;
  public static final int Cashier = 3;
  public static final int Company = 4;
  public static final int Customer = 5;
  public static final int Discount = 6;
  public static final int Item = 7;
  public static final int LineItem = 8;
  public static final int Person = 9;
  public static final int Price = 10;
  public static final int Stock = 11;
  public static final int Tax = 12;
  public static final int Transaction = 13;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x1235c5e631fd4d86L, 0xa6f2f516980c6b8fL);
    builder.put(0x73a9c81d9814e99L, AdditionalCharge);
    builder.put(0x73a9c81d9814dbeL, Address);
    builder.put(0x73a9c81d981e8f3L, Card);
    builder.put(0x73a9c81d9814e28L, Cashier);
    builder.put(0x73a9c81d9814dbdL, Company);
    builder.put(0x73a9c81d9814e22L, Customer);
    builder.put(0x73a9c81d9814e93L, Discount);
    builder.put(0x73a9c81d9814e60L, Item);
    builder.put(0x73a9c81d9814e79L, LineItem);
    builder.put(0x73a9c81d9814e1dL, Person);
    builder.put(0x224e3869a153137dL, Price);
    builder.put(0x73a9c81d9814dbfL, Stock);
    builder.put(0x73a9c81d9814e9cL, Tax);
    builder.put(0x73a9c81d9814dc0L, Transaction);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}