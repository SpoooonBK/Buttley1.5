package nyc.esteban.buttley15;

import org.andengine.engine.Engine;
import org.andengine.engine.camera.BoundCamera;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

/**
 * Created by Spoooon on 1/11/2015.
 */
public class ResourceManager {

    public Engine mEngine;
    public MainGameActivity mActivity;
    public BoundCamera mCamera;
    public VertexBufferObjectManager mVbom;


    private static final ResourceManager sINSTANCE = new ResourceManager();

    public static void prepareManager(Engine engine, MainGameActivity activity, BoundCamera camera,
                                      VertexBufferObjectManager vbom){
        getInstance().mActivity = activity;
        getInstance().mEngine = engine;
        getInstance().mVbom = vbom;
        getInstance().mCamera = camera;
    }

    public static ResourceManager getInstance(){
        return sINSTANCE;
    }

    public Engine getmEngine() {
        return mEngine;
    }

    public void setmEngine(Engine mEngine) {
        this.mEngine = mEngine;
    }

    public MainGameActivity getmActivity() {
        return mActivity;
    }

    public void setmActivity(MainGameActivity mActivity) {
        this.mActivity = mActivity;
    }

    public BoundCamera getmCamera() {
        return mCamera;
    }

    public void setmCamera(BoundCamera mCamera) {
        this.mCamera = mCamera;
    }

    public VertexBufferObjectManager getmVbom() {
        return mVbom;
    }

    public void setmVbom(VertexBufferObjectManager mVbom) {
        this.mVbom = mVbom;
    }
}
