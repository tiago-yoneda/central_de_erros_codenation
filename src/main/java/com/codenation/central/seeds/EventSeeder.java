package com.codenation.central.seeds;

import com.codenation.central.entity.Event;
import com.codenation.central.service.implementation.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventSeeder implements ApplicationRunner {
    @Autowired
    private EventService eventService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Event event = new Event();
        event.setLevel("error");
        event.setOrigem("Application");
        event.setLog("Exception  AclNotFoundException ...");
        event.setDescription("This is an exception that is thrown whenever a reference is made to a non-existent ACL (Access Control List).");
        event.setQuantity("3");
        eventService.save(event);

        Event event1 = new Event();
        event1.setLevel("error");
        event1.setOrigem("Application");
        event1.setLog("Exception  BadAttributeValueExpException ...");
        event1.setDescription("Thrown when an invalid MBean attribute is passed to a query constructing method. This exception is used internally by JMX during the evaluation of a query. User code does not usually see it.");
        event1.setQuantity("15");
        eventService.save(event1);

        Event event2 = new Event();
        event2.setLevel("error");
        event2.setOrigem("Application");
        event2.setLog("Exception  AlreadyBoundException ...");
        event2.setDescription("An AlreadyBoundException is thrown if an attempt is made to bind an object in the registry to a name that already has an associated binding.");
        event2.setQuantity("7");
        eventService.save(event2);

        Event event3 = new Event();
        event3.setLevel("error");
        event3.setOrigem("Application");
        event3.setLog("Exception  ApplicationException ...");
        event3.setDescription("This class is used for reporting application level exceptions between ORBs and stubs.");
        event3.setQuantity("13");
        eventService.save(event3);

        Event event4 = new Event();
        event4.setLevel("error");
        event4.setOrigem("Application");
        event4.setLog("Exception  BackingStoreException ...");
        event4.setDescription("Thrown to indicate that a preferences operation could not complete because of a failure in the backing store, or a failure to contact the backing store.");
        event4.setQuantity("31");
        eventService.save(event4);

        Event event5 = new Event();
        event5.setLevel("error");
        event5.setOrigem("Application");
        event5.setLog("Exception  AWTException ...");
        event5.setDescription("Signals that an Abstract Window Toolkit exception has occurred.");
        event5.setQuantity("8");
        eventService.save(event5);

        Event event6 = new Event();
        event6.setLevel("error");
        event6.setOrigem("Application");
        event6.setLog("Exception  BackingStoreException ...");
        event6.setDescription("Thrown to indicate that a preferences operation could not complete because of a failure in the backing store, or a failure to contact the backing store.");
        event6.setQuantity("19");
        eventService.save(event6);

        Event event7 = new Event();
        event7.setLevel("error");
        event7.setOrigem("Application");
        event7.setLog("Exception ActivationException ...");
        event7.setDescription("General exception used by the activation interfaces.");
        event7.setQuantity("13");
        eventService.save(event7);

        Event event8 = new Event();
        event8.setLevel("error");
        event8.setOrigem("Application");
        event8.setLog("Exception BadAttributeValueExpException...");
        event8.setDescription("Thrown when an invalid MBean attribute is passed to a query constructing method. This exception is used internally by JMX during the evaluation of a query. User code does not usually see it");
        event8.setQuantity("11");
        eventService.save(event8);

        Event event9 = new Event();
        event9.setLevel("error");
        event9.setOrigem("Application");
        event9.setLog("Exception BadBinaryOpValueExpException ...");
        event9.setDescription("Thrown when an invalid expression is passed to a method for constructing a query. This exception is used internally by JMX during the evaluation of a query. User code does not usually see it.\n");
        event9.setQuantity("3");
        eventService.save(event9);

        Event event10 = new Event();
        event10.setLevel("error");
        event10.setOrigem("Application");
        event10.setLog("Exception BadLocationException...");
        event10.setDescription("This exception is to report bad locations within a document model (that is, attempts to reference a location that doesn't exist).");
        event10.setQuantity("3");
        eventService.save(event10);

        Event event11 = new Event();
        event11.setLevel("error");
        event11.setOrigem("Application");
        event11.setLog("Exception BadStringOperationException...");
        event11.setDescription("Thrown when an invalid string operation is passed to a method for constructing a query.");
        event11.setQuantity("7");
        eventService.save(event11);

        Event event12 = new Event();
        event12.setLevel("error");
        event12.setOrigem("Application");
        event12.setLog("Exception BrokenBarrierException...");
        event12.setDescription("Exception thrown when a thread tries to wait upon a barrier that is in a broken state, or which enters the broken state while the thread is waiting.");
        event12.setQuantity("9");
        eventService.save(event12);

        Event event13 = new Event();
        event13.setLevel("error");
        event13.setOrigem("Application");
        event13.setLog("Exception CertificateException...");
        event13.setDescription("This exception indicates one of a variety of certificate problems.");
        event13.setQuantity("30");
        eventService.save(event13);

        Event event14 = new Event();
        event14.setLevel("error");
        event14.setOrigem("Application");
        event14.setLog("Exception CloneNotSupportedException ...");
        event14.setDescription("Thrown to indicate that the clone method in class Object has been called to clone an object, but that the object's class does not implement the Cloneable interface.");
        event14.setQuantity("11");
        eventService.save(event14);

        Event event15 = new Event();
        event15.setLevel("error");
        event15.setOrigem("Application");
        event15.setLog("Exception DataFormatException ...");
        event15.setDescription("Signals that a data format error has occurred.");
        event15.setQuantity("3");
        eventService.save(event15);

        Event event16 = new Event();
        event16.setLevel("error");
        event16.setOrigem("Application");
        event16.setLog("Exception DatatypeConfigurationException...");
        event16.setDescription("Indicates a serious configuration error.");
        event16.setQuantity("7");
        eventService.save(event16);

        Event event17 = new Event();
        event17.setLevel("error");
        event17.setOrigem("Application");
        event17.setLog("Exception DestroyFailedException...");
        event17.setDescription("This exception is thrown by credentials implementing the Destroyable interface when the destroy method fails.");
        event17.setQuantity("22");
        eventService.save(event17);

        Event event18 = new Event();
        event18.setLevel("error");
        event18.setOrigem("Application");
        event18.setLog("Exception ExpandVetoException ...");
        event18.setDescription("Exception used to stop and expand/collapse from happening. See How to Write a Tree-Will-Expand Listener in The Java Tutorial for further information and examples.");
        event18.setQuantity("26");
        eventService.save(event18);

        Event event19 = new Event();
        event19.setLevel("error");
        event19.setOrigem("Application");
        event19.setLog("Exception  FontFormatException...");
        event19.setDescription("Thrown by method createFont in the Font class to indicate that the specified font is bad.");
        event19.setQuantity("17");
        eventService.save(event19);

        Event event20 = new Event();
        event20.setLevel("error");
        event20.setOrigem("Application");
        event20.setLog("Exception GeneralSecurityException...");
        event20.setDescription("The GeneralSecurityException class is a generic security exception class that provides type safety for all the security-related exception classes that extend from it.");
        event20.setQuantity("13");
        eventService.save(event20);

        Event event21 = new Event();
        event21.setLevel("error");
        event21.setOrigem("Application");
        event21.setLog("Exception IllegalClassFormatException...");
        event21.setDescription("Thrown by an implementation of ClassFileTransformer.transform when its input parameters are invalid.");
        event21.setQuantity("13");
        eventService.save(event21);

        Event event22 = new Event();
        event22.setLevel("error");
        event22.setOrigem("Application");
        event22.setLog("Exception InterruptedException...");
        event22.setDescription("Thrown when a thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity");
        event22.setQuantity("34");
        eventService.save(event);

        Event event23 = new Event();
        event23.setLevel("error");
        event23.setOrigem("Application");
        event23.setLog("Exception IntrospectionException...");
        event23.setDescription("Thrown when an exception happens during Introspection.");
        event23.setQuantity("54");
        eventService.save(event23);

        Event event24 = new Event();
        event24.setLevel("error");
        event24.setOrigem("Application");
        event24.setLog("Exception InvalidApplicationException...");
        event24.setDescription("Thrown when an attempt is made to apply either of the following: A subquery expression to an MBean or a qualified attribute expression to an MBean of the wrong class.");
        event24.setQuantity("6");
        eventService.save(event24);

        Event event25 = new Event();
        event25.setLevel("error");
        event25.setOrigem("Application");
        event25.setLog("Exception InvalidMidiDataException...");
        event25.setDescription("An InvalidMidiDataException indicates that inappropriate MIDI data was encountered. This often means that the data is invalid in and of itself.");
        event25.setQuantity("3");
        eventService.save(event25);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);
//
//        Event event = new Event();
//        event.setLevel("error");
//        event.setOrigem("Application");
//        event.setLog("Exception ...");
//        event.setDescription("");
//        event.setQuantity("3");
//        eventService.save(event);


    }
}
