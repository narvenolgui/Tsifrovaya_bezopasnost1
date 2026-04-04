import java.util.Scanner;

public class StopThinkGame {
    // ANSI коды для ярких цветов
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BOLD = "\u001B[1m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";

    private static int score = 0;
    private static int totalQuestions = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printTitle();
        printIntro();
        waitForEnter();

        scenario1();
        scenario2();
        scenario3();
        scenario4();

        printFinalScore();
        printCopyright();
        scanner.close();
    }

    private static void printTitle() {
        System.out.println(PURPLE + BOLD);
        System.out.println("  ╔══════════════════════════════════════════════════════════════╗");
        System.out.println("  ║      НЕ ДАЙ СЕБЯ ОБМАНУТЬ!                                   ║");
        System.out.println("  ║      ИГРА-ТРЕНАЖЁР ПО КИБЕРБЕЗОПАСНОСТИ                      ║");
        System.out.println("  ╚══════════════════════════════════════════════════════════════╝");
        System.out.println(RESET);
    }

    private static void printIntro() {
        System.out.println(CYAN + "Привет, игрок! 👋");
        System.out.println("Мошенники всё чаще вовлекают подростков в преступления через мессенджеры.");
        System.out.println("Твоя задача — в 4 реальных ситуациях выбрать правильный ответ.");
        System.out.println("За каждый верный шаг ты получишь очки и важную информацию.");
        System.out.println(YELLOW + "Твои знания спасут от тюрьмы и миллионных штрафов!" + RESET);
        System.out.println("\n📊 Статистика за полгода (окт.2025 - апр.2026):");
        System.out.println(RED + "➜ 8 подростков в Москве и области подожгли банкоматы и АЗС" + RESET);
        System.out.println(RED + "➜ Все задержаны, возбуждены уголовные дела (ст.167, 205 УК РФ)" + RESET);
        System.out.println(GREEN + "➜ Цель игры: ТЫ НЕ СТАНЕШЬ 9-М!" + RESET);
        System.out.println("Нажми Enter, чтобы начать...");
    }

    private static void waitForEnter() {
        scanner.nextLine();
    }

    private static void scenario1() {
        totalQuestions++;
        System.out.println("\n" + BLUE + BOLD + "═══════════════════════════════════════════════");
        System.out.println("🔥 СЦЕНАРИЙ 1: Звонок от \"следователя\"");
        System.out.println("═══════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "Тебе приходит сообщение в Telegram от человека с фото полицейского удостоверения:" + RESET);
        System.out.println(BG_RED + "   \"Срочно! Твой друг замешан в теракте. Помоги следствию — подожги банкомат на углу. Иначе тебя посадят как соучастника!\"   " + RESET);
        System.out.println("\nТвои действия:");
        System.out.println(CYAN + "A) Сразу бегу с зажигалкой к банкомату — боюсь за друга.");
        System.out.println("B) Требую личной встречи в отделении полиции и говорю родителям.");
        System.out.println("C) Предлагаю перевести деньги, чтобы отмазать друга." + RESET);
        System.out.print("Введи A, B или C: ");
        String answer = scanner.nextLine().trim().toUpperCase();

        switch (answer) {
            case "B":
                System.out.println(GREEN + BOLD + "✅ ПРАВИЛЬНО! +20 очков" + RESET);
                score += 20;
                System.out.println(GREEN + "Настоящий следователь никогда не попросит подростка совершить поджог. Ты оборвал диалог и сообщил взрослым — схема провалена." + RESET);
                break;
            case "A":
                System.out.println(RED + BOLD + "❌ НЕВЕРНО! Это ловушка." + RESET);
                System.out.println(RED + "Ты совершил поджог — теперь тебе грозит от 5 до 20 лет тюрьмы и иск на миллионы рублей. Мошенник сразу исчезнет." + RESET);
                break;
            case "C":
                System.out.println(RED + BOLD + "❌ НЕВЕРНО! Деньги не решат проблему." + RESET);
                System.out.println(RED + "Мошенник просто обворует тебя и продолжит шантажировать. Не переводи незнакомцам!" + RESET);
                break;
            default:
                System.out.println(RED + "Некорректный ввод. Правильный ответ: B" + RESET);
        }
        System.out.println(CYAN + "\n📌 ЗАПОМНИ: Любой незнакомец, требующий преступления — мошенник. Алгоритм: СТОП → ПОСОВЕТУЙСЯ С РОДИТЕЛЯМИ → СООБЩИ В ПОЛИЦИЮ (102)." + RESET);
        waitForEnter();
    }

    private static void scenario2() {
        totalQuestions++;
        System.out.println("\n" + PURPLE + BOLD + "═══════════════════════════════════════════════");
        System.out.println("💔 СЦЕНАРИЙ 2: \"Девушка\" из соцсетей");
        System.out.println("═══════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "Ты познакомился с красивой девушкой (фото модели) в Instagram. Она пишет:" + RESET);
        System.out.println(BG_RED + "   \"Привет, ты мне очень нравишься! Помоги снять видео для моего блога: подожги АЗС, я дам тебе 30 000 руб. и мы встретимся. Никому не говори!\"   " + RESET);
        System.out.println("\nТвои действия:");
        System.out.println(CYAN + "A) Соглашаюсь — и деньги, и девушка, что может пойти не так?");
        System.out.println("B) Пишу: \"Встретимся сначала в реальности\" — если откажется, блокирую и говорю родителям.");
        System.out.println("C) Прошу прислать интимные фото в ответ." + RESET);
        System.out.print("Введи A, B или C: ");
        String answer = scanner.nextLine().trim().toUpperCase();

        switch (answer) {
            case "B":
                System.out.println(GREEN + BOLD + "✅ ПРАВИЛЬНО! +20 очков" + RESET);
                score += 20;
                System.out.println(GREEN + "Мошенник никогда не согласится на реальную встречу. Ты его раскусил и избежал уголовки." + RESET);
                break;
            case "A":
                System.out.println(RED + BOLD + "❌ ОПАСНО! Это провокация." + RESET);
                System.out.println(RED + "Реальные случаи: в феврале 2026 года 14-летний подросток поджёг банкомат по просьбе \"девушки\" с сайта знакомств. Его задержали, девушки не существовало." + RESET);
                break;
            case "C":
                System.out.println(RED + BOLD + "❌ НЕВЕРНО! Это тоже уловка." + RESET);
                System.out.println(RED + "Мошенники могут использовать твои фото для шантажа. Не пересылай интимных материалов!" + RESET);
                break;
            default:
                System.out.println(RED + "Некорректный ввод. Правильный ответ: B" + RESET);
        }
        System.out.println(CYAN + "\n📌 ЗАПОМНИ: За красивым аватаром часто стоит мошенник из другой страны. Реальная девушка не попросит тебя стать преступником." + RESET);
        waitForEnter();
    }

    private static void scenario3() {
        totalQuestions++;
        System.out.println("\n" + YELLOW + BOLD + "═══════════════════════════════════════════════");
        System.out.println("💰 СЦЕНАРИЙ 3: Легкий заработок");
        System.out.println("═══════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "В TikTok тебе приходит реклама: \"Заработай 50 000 руб. за час! Нужно просто кинуть коктейль Молотова в банкомат. Платёж сразу на карту.\"" + RESET);
        System.out.println(BG_RED + "   \"Это не больно, банкомат застрахован. Никто не пострадает!\"   " + RESET);
        System.out.println("\nТвои действия:");
        System.out.println(CYAN + "A) Берусь — деньги нужны на новый айфон.");
        System.out.println("B) Игнорирую, блокирую и жалуюсь на рекламу.");
        System.out.println("C) Прошу предоплату 50% и потом исчезаю." + RESET);
        System.out.print("Введи A, B или C: ");
        String answer = scanner.nextLine().trim().toUpperCase();

        switch (answer) {
            case "B":
                System.out.println(GREEN + BOLD + "✅ ПРАВИЛЬНО! +20 очков" + RESET);
                score += 20;
                System.out.println(GREEN + "Ты не повелся на легкие деньги. В марте 2026 года 15-летний парень получил ожоги 40% тела при поджоге банкомата — его не заплатили, а посадили." + RESET);
                break;
            case "A":
                System.out.println(RED + BOLD + "❌ СТОП! Это статья 205 УК РФ." + RESET);
                System.out.println(RED + "Ты становишься фигурантом дела о теракте. Срок — до 20 лет. Денег ты не увидишь, а родителям придётся продать квартиру для возмещения ущерба." + RESET);
                break;
            case "C":
                System.out.println(RED + BOLD + "❌ НЕВЕРНО! Это тоже мошенничество." + RESET);
                System.out.println(RED + "Ты не обманешь преступников — они запишут твой отказ и передадут в полицию как \"уклонение от задания\". Риск огромен." + RESET);
                break;
            default:
                System.out.println(RED + "Некорректный ввод. Правильный ответ: B" + RESET);
        }
        System.out.println(CYAN + "\n📌 ЗАПОМНИ: Ни один честный работодатель не попросит тебя совершить преступление. Легких денег не бывает — только уголовка." + RESET);
        waitForEnter();
    }

    private static void scenario4() {
        totalQuestions++;
        System.out.println("\n" + RED + BOLD + "═══════════════════════════════════════════════");
        System.out.println("😨 СЦЕНАРИЙ 4: Угроза родителям");
        System.out.println("═══════════════════════════════════════════════" + RESET);
        System.out.println(YELLOW + "Незнакомец в мессенджере пишет, что знает адрес твоей семьи. Сообщение:" + RESET);
        System.out.println(BG_RED + "   \"Если ты не подорвешь банкомат у метро до 19:00, мы убьём твою маму. Видео с поджогом обязательно. Никому не звони!\"   " + RESET);
        System.out.println("\nТвои действия:");
        System.out.println(CYAN + "A) В панике бегу к банкомату, лишь бы маму не тронули.");
        System.out.println("B) Немедленно звоню маме, затем в полицию 102, показываю угрозы.");
        System.out.println("C) Пишу мошеннику, чтобы он прислал доказательство." + RESET);
        System.out.print("Введи A, B или C: ");
        String answer = scanner.nextLine().trim().toUpperCase();

        switch (answer) {
            case "B":
                System.out.println(GREEN + BOLD + "✅ ПРАВИЛЬНО! +20 очков" + RESET);
                score += 20;
                System.out.println(GREEN + "99% угроз — фейк. Мошенники не могут найти твою семью, если ты сам им не поможешь. Полиция задержит их по IP. Ты спас себя и близких." + RESET);
                break;
            case "A":
                System.out.println(RED + BOLD + "❌ ЭТО ЛОВУШКА!" + RESET);
                System.out.println(RED + "Ты совершишь теракт, а маму всё равно не тронут — мошенники просто хотели, чтобы ты сделал их \"грязную работу\". После поджога тебя арестуют, а родители будут платить миллионы." + RESET);
                break;
            case "C":
                System.out.println(RED + BOLD + "❌ НЕВЕРНО! Не вступай в диалог." + RESET);
                System.out.println(RED + "Любое обсуждение с мошенником даёт ему больше рычагов давления. Сразу блокируй и сообщай взрослым." + RESET);
                break;
            default:
                System.out.println(RED + "Некорректный ввод. Правильный ответ: B" + RESET);
        }
        System.out.println(CYAN + "\n📌 ЗАПОМНИ: При угрозе жизни близких — СРАЗУ ЗВОНИ В ПОЛИЦИЮ 102. Они научат, как себя вести. Никогда не выполняй требований преступников." + RESET);
        waitForEnter();
    }

    private static void printFinalScore() {
        System.out.println("\n" + GREEN + BOLD + "╔════════════════════════════════════════════════════════════╗");
        System.out.println("║                     ИТОГОВАЯ ОЦЕНКА                         ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝" + RESET);
        System.out.println("Твой счёт: " + YELLOW + score + " из " + (totalQuestions * 20) + RESET);
        if (score == 80) {
            System.out.println(GREEN + BOLD + "🎉 ОТЛИЧНО! Ты полностью неуязвим для мошенников! Ты знаешь, как защитить себя и своих близких." + RESET);
            System.out.println(GREEN + "Помни: в Москве уже 8 пострадавших подростков, но ты не станешь девятым." + RESET);
        } else if (score >= 40) {
            System.out.println(YELLOW + BOLD + "👍 ХОРОШО, но есть пробелы. Пересмотри свои ошибки и запомни алгоритмы безопасности." + RESET);
        } else {
            System.out.println(RED + BOLD + "⚠️ Ты в группе риска! Переиграй ещё раз — это спасёт твою жизнь и свободу." + RESET);
        }
        System.out.println(CYAN + "\nГЛАВНЫЕ ПРАВИЛА, которые ты усвоил:");
        System.out.println("1️⃣ Никогда не выполняй действий с огнём, взрывчаткой или повреждением имущества по просьбе из интернета.");
        System.out.println("2️⃣ Любой незнакомец, требующий преступления — мошенник.");
        System.out.println("3️⃣ Сообщи родителям или в полицию (102) — это снимает с тебя ответственность.");
        System.out.println("4️⃣ Сохраняй переписку — она твоё доказательство в суде.");
        System.out.println(RED + BOLD + "ПОМНИ: УГОЛОВНАЯ ОТВЕТСТВЕННОСТЬ С 14 ЛЕТ. ШТРАФЫ — ДО МИЛЛИОНОВ РУБЛЕЙ. СРОК — ДО 20 ЛЕТ." + RESET);
    }

    private static void printCopyright() {
        System.out.println("\n" + PURPLE + "═══════════════════════════════════════════════════════════════════");
        System.out.println("                 narven_olgui © 2026");
        System.out.println("         Сделано для профилактики вовлечения подростков");
        System.out.println("           в преступные схемы через мессенджеры.");
        System.out.println("═══════════════════════════════════════════════════════════════════" + RESET);
    }
}
