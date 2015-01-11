package nyc.esteban.buttley15.model.characters;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import java.util.ArrayList;
import java.util.List;
import nyc.esteban.buttley15.model.sounds.Sound;


/**
 * Created by Tara on 1/8/2015.
 */
public class CharacterFactory {


    private List<GameCharacter> gameCharacterList = new ArrayList<GameCharacter>();


    public List<GameCharacter> buildAllCharacters(){

        for(NamesEnum name: NamesEnum.values()){
            gameCharacterList.add(buildCharacter(name));
        }

        return gameCharacterList;
    }



    public GameCharacter buildCharacter(NamesEnum namesEnum){

        GameCharacter character = new GameCharacter();



        Bitmap snapshot = null;
        List<AnimationDrawable> animations = null;
        List<Sound> sounds = null;
        boolean unlocked = true;

        switch (namesEnum){
            case AIR_BISCUIT:{

            }
        }


        return character;
    }




}
