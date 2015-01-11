package nyc.esteban.buttley15;

import org.andengine.engine.Engine;

/**
 * Created by Spoooon on 1/11/2015.
 */
public class SceneManager {

    private BaseScene mMainMenu;
    private BaseScene mGameScene;
    private BaseScene mCurrentScene;

    private final static SceneManager mINSTANCE = new SceneManager();
    private SceneType mCurrentSceneType;
    private Engine engine = ResourceManager.getInstance().getmEngine();


    public BaseScene getmMainMenu() {
        return mMainMenu;
    }

    public void setmMainMenu(BaseScene mMainMenu) {
        this.mMainMenu = mMainMenu;
    }

    public BaseScene getmGameScene() {
        return mGameScene;
    }

    public void setmGameScene(BaseScene mGameScene) {
        this.mGameScene = mGameScene;
    }

    public BaseScene getmCurrentScene() {
        return mCurrentScene;
    }

    public void setmCurrentScene(BaseScene mCurrentScene) {
        this.mCurrentScene = mCurrentScene;
    }



    public static SceneManager getInstance(){

        return mINSTANCE;
    }

    public SceneType getmCurrentSceneType() {
        return mCurrentSceneType;
    }

    public void setmCurrentSceneType(SceneType mCurrentSceneType) {
        this.mCurrentSceneType = mCurrentSceneType;
    }

    /**
     * Created by Spoooon on 1/11/2015.
     */
    public static enum SceneType {

        SCENE_MENU,
        SCENE_GAME
    }

    public void setScene(BaseScene scene){
        engine.setScene(scene);
        setmCurrentScene(scene);
        setmCurrentSceneType(scene.getSceneType());
    }

}
