package rendering.materials;

import rendering.Camera;
import tpa.graphics.geometry.Mesh;
import tpa.graphics.render.Renderer;
import tpa.graphics.render.RendererState;
import tpa.graphics.shader.ShaderProgram;
import tpa.joml.Matrix4f;

/**
 * Created by germangb on 13/04/16.
 */
public abstract class Material {

    /** Shader program asociated with this material */
    protected ShaderProgram program;

    /** state of the renderer */
    protected RendererState state = new RendererState();

    /**
     * Create a material asociated with a shader program
     * @param program shader program
     */
    public Material (ShaderProgram program) {
        this.program = program;
    }

    /**
     * Use material to render specific mesh
     * @param renderer renderer implementation
     * @param camera projection & view transformation
     */
    public abstract void render (Renderer renderer, Camera camera, Mesh mesh, Matrix4f model);
}
