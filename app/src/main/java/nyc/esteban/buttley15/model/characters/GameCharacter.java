package nyc.esteban.buttley15.model.characters;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;

import java.util.List;

import nyc.esteban.buttley15.model.sounds.Sound;

/**
 * Created by Tara on 1/8/2015.
 */
public class GameCharacter {

    private Bitmap mSnapshot;
    private List<AnimationDrawable> mAnimationsList;
    private List<Sound> mSoundsList;
    private boolean mUnlocked;
    private CharacterType mCharacterType;

    protected GameCharacter(){
    }

    public GameCharacter(Bitmap mSnapshot, List<AnimationDrawable> mAnimationsList, List<Sound> mSoundsList, boolean mUnlocked, CharacterType mCharacterType) {
        this.mSnapshot = mSnapshot;
        this.mAnimationsList = mAnimationsList;
        this.mSoundsList = mSoundsList;
        this.mUnlocked = mUnlocked;
        this.mCharacterType = mCharacterType;
    }

    public CharacterType getmCharacterType() {
        return mCharacterType;
    }

    public void setmCharacterType(CharacterType mCharacterType) {
        this.mCharacterType = mCharacterType;
    }

    public Bitmap getmSnapshot() {
        return mSnapshot;
    }

    public void setmSnapshot(Bitmap mSnapshot) {
        this.mSnapshot = mSnapshot;
    }

    public List<AnimationDrawable> getmAnimationsList() {
        return mAnimationsList;
    }

    public void setmAnimationsList(List<AnimationDrawable> mAnimationsList) {
        this.mAnimationsList = mAnimationsList;
    }

    public List<Sound> getmSoundsList() {
        return mSoundsList;
    }

    public void setmSoundsList(List<Sound> mSoundsList) {
        this.mSoundsList = mSoundsList;
    }


    public boolean ismUnlocked() {
        return mUnlocked;
    }

    public void setmUnlocked(boolean mUnlocked) {
        this.mUnlocked = mUnlocked;
    }




}
