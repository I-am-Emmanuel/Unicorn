
import java.util.Scanner;

public class Nokia {
    static int menu;
    static int Phonebook;
    static int options;
    static int Messages;
    static int Messagesettings;
    static int Set;
    static int Common;
    static int Chat;
    static int Callregister;
    static int Missedcalls;
    static int Callduration;
    static int Callcost;
    static int Tones;
    static int Callcostsettings;
    static int Settings;
    static int Callsettings;
    static int Phonesettings;
    static int Securitysettings;
    static int Clock;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Nokia 3310\nPress 1 to go to the phone menu :");
        for (int button = 1; button <= 1; button++) {
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Welcome to the Phone Menu\nPress any number to go to any of the listed directories;\n1. Phonebook\n2. Messages\n3. Chat\n4. Call Resgister\n5. Tones\n6. Settings\n7. Call Divert\n8. Games\n9. Calculator\n10. Clock\n11. Reminders\n12. Profiles\n13. SIM Services");
                    break;
            }
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Search\nService Nos.\nAdd Name\nErase\nEdit\nAssign tone\nSend b'card\nOptions\nSpeed dials\nVoice tags");
                    Phonebook = input.nextInt();
                    switch (Phonebook) {
                        case 1:
                            System.out.println("search");
                            break;
                        case 2:
                            System.out.println("Service Nos.");
                            break;
                        case 3:
                            System.out.println("Add name");
                            break;
                        case 4:
                            System.out.println("Erase");
                            break;
                        case 5:
                            System.out.println("Edit");
                            break;
                        case 6:
                            System.out.println("Assign tone");
                            break;
                        case 7:
                            System.out.println("Send b'card");
                            break;
                        case 8:
                            System.out.println("Type of view\nMemory status");
                            options = input.nextInt();
                            switch (options) {
                                case 1:
                                    System.out.println("Type of view");
                                    break;
                                case 2:
                                    System.out.println("Memory status");
                                    break;
                            }
                    }
                    switch (Phonebook) {
                        case 9:
                            System.out.println("Speed dials");
                            break;
                        case 10:
                            System.out.println("Voice tags");
                            break;
                    }
            }
            switch (menu){
                case 2:
                    System.out.println("Write messages\nInbox\nOutbox\nPictures\nTemplates\nSmileys\nMessage settings\nInfo services\nVoice mailbox number\nService command editor");
                    Messages = input.nextInt();
                    switch (Messages) {
                        case 1:
                            System.out.println("Write messages");
                            break;
                        case 2:
                            System.out.println("Inbox");
                            break;
                        case 3:
                            System.out.println("Out box");
                            break;
                        case 4:
                            System.out.println("Pictures");
                            break;
                        case 5:
                            System.out.println("Templates");
                            break;
                        case 6:
                            System.out.println("Smileys");
                            break;
                        case 7:
                            System.out.println("Set\nCommon");
                            Messagesettings = input.nextInt();
                            switch (Messagesettings) {
                                case 1:
                                    System.out.println("Messages centre number\nMessage sent as\nMessage validity");
                                    Set = input.nextInt();
                                    switch (Set) {
                                        case 1:
                                            System.out.println("Message centre number");
                                            break;
                                        case 2:
                                            System.out.println("Message sent as");
                                            break;
                                        case 3:
                                            System.out.println("Message validity");
                                            break;
                                    }
                            }
                            switch (Messagesettings) {
                                case 2:
                                    System.out.println("Delivery reports\nReply via same centre\nCharacter support");
                                    Common = input.nextInt();
                                    switch (Common) {
                                        case 1:
                                            System.out.println("Delivery reports");
                                            break;
                                        case 2:
                                            System.out.println("Reply via same centre");
                                            break;
                                        case 3:
                                            System.out.println("Character support");
                                            break;
                                    }
                            }
                    }
                    switch (Messages) {
                        case 8:
                            System.out.println("Info services");
                            break;
                        case 9:
                            System.out.println("Voice mailbox number");
                            break;
                        case 10:
                            System.out.println("Service command editor");
                            break;
                    }
            }
            switch (menu) {
                case 3:
                    System.out.println("Chat");
                    break;
                case 4:
                    System.out.println("Missed calls\nReceived calls\nDialled numbers\nErase recent call list\nShow call duration\nShow call costs\nCall cost settings\nPrepaid credit");
                    Callregister = input.nextInt();
                    switch (Callregister) {
                        case 1:
                            System.out.println("Missed calls");
                            break;
                        case 2:
                            System.out.println("Received calls");
                            break;
                        case 3:
                            System.out.println("Dialled numbers");
                            break;
                        case 4:
                            System.out.println("Erase recent call lists");
                            break;
                        case 5:
                            System.out.println("Last call duration\nAll calls' duration\nReceived calls' duration\nDialled calls' duration\nClear timers");
                            Callduration = input.nextInt();
                            switch (Callduration) {
                                case 1:
                                    System.out.println("Last call duration");
                                    break;
                                case 2:
                                    System.out.println("All calls' duration");
                                    break;
                                case 3:
                                    System.out.println("Received calls' duration");
                                    break;
                                case 4:
                                    System.out.println("Dialled call duration");
                                    break;
                                case 5:
                                    System.out.println("Clear timers");
                                    break;
                            }
                    }
                    switch (Callregister) {
                        case 6:
                            System.out.println("Last call cost\nAll calls' cost\nClear counters");
                            Callcost = input.nextInt();
                            switch (Callcost) {
                                case 1:
                                    System.out.println("Last call cost");
                                    break;
                                case 2:
                                    System.out.println("All call duration");
                                    break;
                                case 3:
                                    System.out.println("Clear counters");
                                    break;
                            }
                    }
                    switch (Callregister) {
                        case 7:
                            System.out.println("Call cost limits\nShow cost");
                            Callcostsettings = input.nextInt();
                            switch (Callcostsettings) {
                                case 1:
                                    System.out.println("Call cost limit");
                                    break;
                                case 2:
                                    System.out.println("Show costs in");
                                    break;
                            }
                    }
                    switch (Callregister) {
                        case 8:
                            System.out.println("Prepaid credit");
                            break;
                    }
            }
            switch (menu) {
                case 5:
                    System.out.println("Ringing tone\nRinging volume\nIncoming call alert\nComposer\nMessage alert tone\nKeypad tones\nWarning and game tones\nVibrating alert\nScreen saver");
                    Tones = input.nextInt();
                    switch (Tones) {
                        case 1:
                            System.out.println("Ringing tone");
                            break;
                        case 2:
                            System.out.println("Ringing volume");
                            break;
                        case 3:
                            System.out.println("Incoming call alert");
                            break;
                        case 4:
                            System.out.println("Composer");
                            break;
                        case 5:
                            System.out.println("Message alert tone");
                            break;
                        case 6:
                            System.out.println("Keypard tone");
                            break;
                        case 7:
                            System.out.println("Warning and game tone");
                            break;
                        case 8:
                            System.out.println("Vibrating alert");
                            break;
                        case 9:
                            System.out.println("Screen saver");
                            break;
                    }
            }
            switch (menu) {
                case 6:
                    System.out.println("Call settings\nPhone settings\nSecurity settings\nRestore factory settings");
                    Settings = input.nextInt();
                    switch (Settings) {
                        case 1:
                            System.out.println("Automatic redial\nSpeed dialling\nCall waiting options\nOwn number sending\nPhone line in use\nAutomatic answer");
                            Callsettings = input.nextInt();
                            switch (Callsettings) {
                                case 1:
                                    System.out.println("Automatic redial");
                                    break;
                                case 2:
                                    System.out.println("Speed dialling");
                                    break;
                                case 3:
                                    System.out.println("Call waiting options");
                                    break;
                                case 4:
                                    System.out.println("Own number sending");
                                    break;
                                case 5:
                                    System.out.println("Phone line in use");
                                    break;
                                case 6:
                                    System.out.println("Automatic answer");
                                    break;
                            }
                    }
                    switch (Settings) {
                        case 2:
                            System.out.println("Language\nCell phone display\nWelcome note\nNetwork selection\nLights\nConfirm SIM service actions");
                            Phonesettings = input.nextInt();
                            switch (Phonesettings) {
                                case 1:
                                    System.out.println("Language");
                                    break;
                                case 2:
                                    System.out.println("Cell phone display");
                                    break;
                                case 3:
                                    System.out.println("Welcome note");
                                    break;
                                case 4:
                                    System.out.println("Network selection");
                                    break;
                                case 5:
                                    System.out.println("Lights");
                                    break;
                                case 6:
                                    System.out.println("Confirm SIM service actions");
                                    break;
                            }
                    }
                    switch (Settings) {
                        case 3:
                            System.out.println("PIN code request\nCall barring service\nFixed dialling\nClosed user group\nPhone security\nChange access codes");
                            Securitysettings = input.nextInt();
                            switch (Securitysettings) {
                                case 1:
                                    System.out.println("PIN code request");
                                    break;
                                case 2:
                                    System.out.println("Call barring service");
                                    break;
                                case 3:
                                    System.out.println("Fixed dialling");
                                    break;
                                case 4:
                                    System.out.println("Closed user group");
                                    break;
                                case 5:
                                    System.out.println("Phone security");
                                    break;
                                case 6:
                                    System.out.println("Change access codes");
                                    break;
                            }
                    }
                    switch (Settings) {
                        case 4:
                            System.out.println("Restore factory settings");
                            break;
                    }
            }
            switch (menu) {
                case 7:
                    System.out.println("Call divert");
                    break;
                case 8:
                    System.out.println("Games");
                    break;
                case 9:
                    System.out.println("Calculator");
                    break;
                case 10:
                    System.out.println("Reminders");
                    break;
                case 11:
                    System.out.println("Alarm clock\nClock settings\nDate setting\nStopwatch\nCountdown timer\nAuto update of date and time");
                    Clock = input.nextInt();
                    switch (Clock) {
                        case 1:
                            System.out.println("Alarm clock");
                            break;
                        case 2:
                            System.out.println("Clock settings");
                            break;
                        case 3:
                            System.out.println("Date setting");
                            break;
                        case 4:
                            System.out.println("Stopwatch");
                            break;
                        case 5:
                            System.out.println("Countdown timer");
                            break;
                        case 6:
                            System.out.println("Auto update of date and time");
                            break;
                    }
            }
            switch (menu) {
                case 12:
                    System.out.println("Profiles");
                    break;
                case 13:
                    System.out.println("SIM processors");
                    break;
            }
        }
    }
}



