package starcraft;

// 수송뱅기
// 8개의 지상유닛을 태울 수 있음
public class Dropship extends FlyingUnit{

    protected GroundUnit[] groundUnits = new GroundUnit[8];

    //유닛 하나를 태운다. 메소드명 load
    //태웠으면 return true, 못태우면 return false

    protected int loadedIndex = 0;

    public boolean load(GroundUnit groundUnit){
        if(loadedIndex == groundUnits.length){
            System.out.println("태울 수 없습니다.");
            return false;
        }
        groundUnits[loadedIndex++] = groundUnit;
        return true;
    }


    // 유닛 하나를 떨군다. 메소드명 unload
    // 떨굴 유닛이 없으면 return null;
    public GroundUnit unload (){
        if(loadedIndex == 0){
        return null;
        }
        GroundUnit groundUnit = groundUnits[--loadedIndex];
        groundUnits[loadedIndex] = null;
        return groundUnit;
    }
}

