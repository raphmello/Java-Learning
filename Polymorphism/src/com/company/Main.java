package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "The plot of Jaws";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "The plot of Independence Day";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
         super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Plot of Maze Runner";
    }
}
class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Plot of StarWars";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i=1;i<11;i++) {
            Movie movie = randomMovie();
            System.out.println("Movie plot is " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number is: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }

    }

}





















