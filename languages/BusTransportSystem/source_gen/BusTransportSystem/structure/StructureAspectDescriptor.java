package BusTransportSystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAdult = createDescriptorForAdult();
  /*package*/ final ConceptDescriptor myConceptBaggage = createDescriptorForBaggage();
  /*package*/ final ConceptDescriptor myConceptBooking = createDescriptorForBooking();
  /*package*/ final ConceptDescriptor myConceptBus = createDescriptorForBus();
  /*package*/ final ConceptDescriptor myConceptChild = createDescriptorForChild();
  /*package*/ final ConceptDescriptor myConceptCity = createDescriptorForCity();
  /*package*/ final ConceptDescriptor myConceptKIOSK = createDescriptorForKIOSK();
  /*package*/ final ConceptDescriptor myConceptOnlinePayment = createDescriptorForOnlinePayment();
  /*package*/ final ConceptDescriptor myConceptPassenger = createDescriptorForPassenger();
  /*package*/ final ConceptDescriptor myConceptPayment = createDescriptorForPayment();
  /*package*/ final ConceptDescriptor myConceptSeat = createDescriptorForSeat();
  /*package*/ final ConceptDescriptor myConceptTicket = createDescriptorForTicket();
  /*package*/ final EnumerationDescriptor myEnumerationBookingStatus = new EnumerationDescriptor_BookingStatus();
  /*package*/ final EnumerationDescriptor myEnumerationDataType = new EnumerationDescriptor_DataType();
  /*package*/ final EnumerationDescriptor myEnumerationPaymentMethod = new EnumerationDescriptor_PaymentMethod();
  /*package*/ final EnumerationDescriptor myEnumerationPoint = new EnumerationDescriptor_Point();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAdult, myConceptBaggage, myConceptBooking, myConceptBus, myConceptChild, myConceptCity, myConceptKIOSK, myConceptOnlinePayment, myConceptPassenger, myConceptPayment, myConceptSeat, myConceptTicket);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Adult:
        return myConceptAdult;
      case LanguageConceptSwitch.Baggage:
        return myConceptBaggage;
      case LanguageConceptSwitch.Booking:
        return myConceptBooking;
      case LanguageConceptSwitch.Bus:
        return myConceptBus;
      case LanguageConceptSwitch.Child:
        return myConceptChild;
      case LanguageConceptSwitch.City:
        return myConceptCity;
      case LanguageConceptSwitch.KIOSK:
        return myConceptKIOSK;
      case LanguageConceptSwitch.OnlinePayment:
        return myConceptOnlinePayment;
      case LanguageConceptSwitch.Passenger:
        return myConceptPassenger;
      case LanguageConceptSwitch.Payment:
        return myConceptPayment;
      case LanguageConceptSwitch.Seat:
        return myConceptSeat;
      case LanguageConceptSwitch.Ticket:
        return myConceptTicket;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationBookingStatus, myEnumerationDataType, myEnumerationPaymentMethod, myEnumerationPoint);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAdult() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Adult", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eab0L);
    b.class_(false, false, false);
    b.super_("BusTransportSystem.structure.Passenger", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea93L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/3893540833473063600");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBaggage() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Baggage", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x5fc8001b1615e1dL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/431360409079995933");
    b.version(2);
    b.property("baggage_tag", 0x5fc8001b1615e1eL).type(PrimitiveTypeId.STRING).origin("431360409079995934").done();
    b.property("weight", 0x5fc8001b1615e20L).type(PrimitiveTypeId.INTEGER).origin("431360409079995936").done();
    b.aggregate("tickets", 0x5fc8001b1615e2eL).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed872L).optional(false).ordered(true).multiple(true).origin("431360409079995950").done();
    b.aggregate("seats", 0x5fc8001b1615e30L).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed848L).optional(false).ordered(true).multiple(true).origin("431360409079995952").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBooking() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Booking", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea79L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/3893540833473063545");
    b.version(2);
    b.property("payment_date", 0x3608a2c259a3ea7cL).type(MetaIdFactory.dataTypeId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed877L)).origin("3893540833473063548").done();
    b.property("journey_date", 0x3608a2c259a3ea7eL).type(MetaIdFactory.dataTypeId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed877L)).origin("3893540833473063550").done();
    b.property("status", 0x3608a2c259a3ea8aL).type(MetaIdFactory.dataTypeId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea81L)).origin("3893540833473063562").done();
    b.associate("payment", 0x29e497cfc2f256cdL).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eab5L).optional(false).origin("3018704568829761229").done();
    b.aggregate("tickets", 0x3608a2c259a3ea8eL).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed872L).optional(false).ordered(true).multiple(true).origin("3893540833473063566").done();
    b.aggregate("seats", 0x3608a2c259a3ea90L).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed848L).optional(false).ordered(true).multiple(true).origin("3893540833473063568").done();
    b.aggregate("passengers", 0x3608a2c259a3eab1L).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea93L).optional(false).ordered(true).multiple(true).origin("3893540833473063601").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBus() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Bus", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3e54ebL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/1397957499054609643");
    b.version(2);
    b.property("capacity", 0x13668af04e3ed854L).type(PrimitiveTypeId.INTEGER).origin("1397957499054643284").done();
    b.property("city", 0x3608a2c259a3ea70L).type(MetaIdFactory.dataTypeId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed857L)).origin("3893540833473063536").done();
    b.aggregate("seat", 0x13668af04e3ed86dL).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed848L).optional(false).ordered(true).multiple(true).origin("1397957499054643309").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForChild() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Child", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eaa4L);
    b.class_(false, false, false);
    b.super_("BusTransportSystem.structure.Passenger", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea93L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/3893540833473063588");
    b.version(2);
    b.property("guardian_id", 0x3608a2c259a3eaa7L).type(PrimitiveTypeId.STRING).origin("3893540833473063591").done();
    b.property("guardian_fname", 0x3608a2c259a3eaa9L).type(PrimitiveTypeId.STRING).origin("3893540833473063593").done();
    b.property("guardian_lname", 0x3608a2c259a3eaacL).type(PrimitiveTypeId.STRING).origin("3893540833473063596").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCity() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "City", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed84dL);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/1397957499054643277");
    b.version(2);
    b.property("bus_stop", 0x13668af04e3ed850L).type(MetaIdFactory.dataTypeId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed857L)).origin("1397957499054643280").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForKIOSK() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "KIOSK", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eaceL);
    b.class_(false, false, false);
    b.super_("BusTransportSystem.structure.Payment", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eab5L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/3893540833473063630");
    b.version(2);
    b.property("booking_name", 0x3608a2c259a3eacfL).type(PrimitiveTypeId.STRING).origin("3893540833473063631").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForOnlinePayment() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "OnlinePayment", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eacbL);
    b.class_(false, false, false);
    b.super_("BusTransportSystem.structure.Payment", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eab5L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/3893540833473063627");
    b.version(2);
    b.property("type", 0x3608a2c259a3eaccL).type(MetaIdFactory.dataTypeId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eab8L)).origin("3893540833473063628").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPassenger() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Passenger", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea93L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/3893540833473063571");
    b.version(2);
    b.property("email", 0x3608a2c259a3ea9bL).type(PrimitiveTypeId.STRING).origin("3893540833473063579").done();
    b.property("phone", 0x3608a2c259a3ea9fL).type(PrimitiveTypeId.STRING).origin("3893540833473063583").done();
    b.aggregate("baggage", 0x5fc8001b161b58eL).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x5fc8001b1615e1dL).optional(true).ordered(true).multiple(true).origin("431360409080018318").done();
    b.aggregate("bookings", 0x5fc8001b161b590L).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3ea79L).optional(false).ordered(true).multiple(true).origin("431360409080018320").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPayment() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Payment", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x3608a2c259a3eab5L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/3893540833473063605");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSeat() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Seat", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed848L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/1397957499054643272");
    b.version(2);
    b.aggregate("tickets", 0x5fc8001b161b3b7L).target(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed872L).optional(false).ordered(true).multiple(false).origin("431360409080017847").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTicket() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BusTransportSystem", "Ticket", 0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed872L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:ed66baf8-00a9-4ade-843c-5dadbf05f6b7(BusTransportSystem.structure)/1397957499054643314");
    b.version(2);
    b.property("price", 0x13668af04e3ed875L).type(MetaIdFactory.dataTypeId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed877L)).origin("1397957499054643317").done();
    b.property("arrival_city", 0x13668af04e3ed879L).type(PrimitiveTypeId.STRING).origin("1397957499054643321").done();
    b.property("departure_city", 0x13668af04e3ed87cL).type(PrimitiveTypeId.STRING).origin("1397957499054643324").done();
    b.property("journey_date", 0x13668af04e3ed880L).type(MetaIdFactory.dataTypeId(0x424422c1d3914c11L, 0x972cef618d3c579bL, 0x13668af04e3ed877L)).origin("1397957499054643328").done();
    return b.create();
  }
}
