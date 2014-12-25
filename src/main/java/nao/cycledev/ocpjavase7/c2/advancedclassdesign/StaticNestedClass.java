package nao.cycledev.ocpjavase7.c2.advancedclassdesign;

public abstract class StaticNestedClass {

    public static class Color{
        int r, g, b;

        public Color() {
            this(255, 255, 255);
        }

        public Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        @Override
        public String toString()
        {
            return "red: " + r + " green: " + g + " blue: " + b;
        }

    }

    static Color getDescriptiveColor(final Color color){

        return new Color() {
            @Override
            public String toString(){
                return "Descriptive " + color;
            }
        };
    }
}
