package JavaStartZadania;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambda_EmailManager_63 {

    public static void main(String[] args) {
        List<Lambda_Email_63> emailList = createEmailList();
        //tylko wysłane emaile
        System.out.println("Wysłane maile:");
        List<Lambda_Email_63> sentEmails = filterByPredicate(emailList, n -> n.isSent());
        consumeList(sentEmails, n -> System.out.println(n));
        System.out.println(" ");
        //filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        List<Lambda_Email_63> bartEmails = filterByPredicate(emailList, n->(n.isSenderOrRecipient("bart@example.com")));
        consumeList(bartEmails, n->System.out.println(n));
        System.out.println(" ");

    }

    private static List<Lambda_Email_63> createEmailList() {
        List<Lambda_Email_63> emails = new ArrayList<>();
        emails.add(new Lambda_Email_63(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Lambda_Email_63(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Lambda_Email_63(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
    //filtruje czy wyslane/czy zawiera maila

    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }

    //printing data
    private static <T> void consumeList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}

