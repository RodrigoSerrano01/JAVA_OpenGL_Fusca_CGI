package FuscaOpenGL.Model;

public abstract class Formas {

    private float rotatedAngle, rotatedX, rotatedY, rotatedZ;
    private float transLatedX,transLatedY, transLatedZ;

    private float scaledX,scaledY, scaledZ;

    private float colorR, colorG, colorB;

    public Formas(float rotatedAngle, float rotatedX, float rotatedY, float rotatedZ, float transLatedX, float transLatedY, float transLatedZ, float scaledX, float scaledY, float scaledZ, float colorR, float colorG, float colorB) {
        this.rotatedAngle = rotatedAngle;
        this.rotatedX = rotatedX;
        this.rotatedY = rotatedY;
        this.rotatedZ = rotatedZ;
        this.transLatedX = transLatedX;
        this.transLatedY = transLatedY;
        this.transLatedZ = transLatedZ;
        this.scaledX = scaledX;
        this.scaledY = scaledY;
        this.scaledZ = scaledZ;
        this.colorR = colorR;
        this.colorG = colorG;
        this.colorB = colorB;
    }

    public float getRotatedAngle() {
        return rotatedAngle;
    }

    public float getRotatedX() {
        return rotatedX;
    }

    public float getRotatedY() {
        return rotatedY;
    }

    public float getRotatedZ() {
        return rotatedZ;
    }

    public float getTransLatedX() {
        return transLatedX;
    }

    public float getTransLatedY() {
        return transLatedY;
    }

    public float getTransLatedZ() {
        return transLatedZ;
    }

    public float getScaledX() {
        return scaledX;
    }

    public float getScaledY() {
        return scaledY;
    }

    public float getScaledZ() {
        return scaledZ;
    }

    public float getColorR() {
        return colorR;
    }

    public float getColorG() {
        return colorG;
    }

    public float getColorB() {
        return colorB;
    }
}
