package sma.rhythmtapper.game.models;

public class Ball {
    public enum BallType {    //enum class
        Normal, OneUp, Multiplier, Speeder, Bomb, Skull
    }

    public int x;
    public int y;
    public BallType type;
    private double speedMultiplier;

    public Ball(int x, int y, BallType type){  //생성자.....
        this.x = x;
        this.y = y;
        this.type = type;
        this.speedMultiplier = type == BallType.Speeder ? 2.4 : 2;  //BallType이 speeder가 맞으면 1.4  아니면 1  //여기가 스피드 설정해주는 곳.
    }

    public void update(int speed) {
        this.y += speed * speedMultiplier;
    }//인수로 들어온 스피드랑.. speedMultiplier를 곱한거를 y에 합산.   y가 속도이고 x가 뭐지
}
