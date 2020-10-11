package com.company;

import java.util.*;


public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows-1);
        for (char row = 'A';row<=lastRow;row++) {
            for (int i = 1;i<=seatsPerRow;i++) {
                double price = 12.00;
                if (row<'D' && i >= 4 && i <=9) {
                    price = 14.00;
                } else if (row>'F' || (i < 4 || i > 9)) {
                    price = 7.00;
                }
                seats.add(new Seat(row + String.format("%02d",i),price));
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if (foundSeat>=0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
//        for (Seat seat : seats) {
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if (requestedSeat == null) {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    public Collection<Seat> getSeats() {
//        for (Seat seat : seats) {
//            System.out.println(seat.getSeatNumber());
//        }
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve() {
            if(!reserved) {
                reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if(reserved) {
                reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
//            System.out.print(".");
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }

}
