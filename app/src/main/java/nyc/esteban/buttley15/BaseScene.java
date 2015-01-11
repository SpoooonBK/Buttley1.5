package nyc.esteban.buttley15;

import android.app.Activity;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.Camera;
import org.andengine.entity.scene.Scene;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

/**
 * Created by Spoooon on 1/11/2015.
 */
public abstract class BaseScene extends Scene {

    protected Engine mEngine;
    protected Activity mActivity;
    protected ResourceManager mResourcesManager;
    protected VertexBufferObjectManager mVbom;
    protected Camera mCamera;


    public BaseScene() {
        mResourcesManager = ResourceManager.getInstance();

        mEngine = mResourcesManager.getmEngine();
        mActivity = mResourcesManager.getmActivity();
        mVbom = mResourcesManager.getmVbom();
        mCamera = mResourcesManager.getmCamera();
    }

    public abstract void createScene();
    public abstract void onBackKeyPressed();
    public abstract SceneManager.SceneType getSceneType();
    public abstract void disposeScene();

}