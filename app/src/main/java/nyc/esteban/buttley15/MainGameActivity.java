package nyc.esteban.buttley15;

import org.andengine.engine.Engine;
import org.andengine.engine.LimitedFPSEngine;
import org.andengine.engine.camera.BoundCamera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.FillResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.ui.IGameInterface;
import org.andengine.ui.activity.BaseGameActivity;


public class MainGameActivity extends BaseGameActivity {

    private BoundCamera mCamera;
    private float WIDTH = 800f;
    private float HEIGHT = 480f;

    @Override
    public Engine onCreateEngine(EngineOptions engineOptions){

        return new LimitedFPSEngine(engineOptions, 60);
    }

    @Override
    public EngineOptions onCreateEngineOptions() {

        mCamera = new BoundCamera(0,0, WIDTH, HEIGHT);

        EngineOptions engineOptions = new
                EngineOptions(true, ScreenOrientation.PORTRAIT_FIXED,
                new FillResolutionPolicy(), mCamera);
        engineOptions.getAudioOptions().setNeedsMusic(true).setNeedsSound(true);
        return engineOptions;
    }

    @Override
    public void onCreateResources(OnCreateResourcesCallback pOnCreateResourcesCallback) throws Exception {

    }

    @Override
    public void onCreateScene(OnCreateSceneCallback pOnCreateSceneCallback) throws Exception {

    }

    @Override
    public void onPopulateScene(Scene pScene, OnPopulateSceneCallback pOnPopulateSceneCallback) throws Exception {

    }
}
