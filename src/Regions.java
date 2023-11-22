public enum Regions {

        BATKEN ("Ай гүл"),

        OSH ("Сулайман- Тоо"),
        CHUY ("Бурана мунарасы"),
        NARYN ("Ташрабат кербен сарайы"),
        TALAS ("Манастын күмбөзү"),
        ISSYK_KUL ("Ысык-Көл"),
        JALAL_ABAD ("Арстанбап жаңгак токою");
        private String wonder;
        Regions(String wonder) {
            this.wonder = wonder;
        }
        public String getWonder() {
            return wonder;
        }
    }

