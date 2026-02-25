public class VectorOperations {

    private double[] vector;

    public VectorOperations(double[] vector) {
        this.vector = vector;
    }

    private void checkSize(VectorOperations v) throws VectorSizeMismatchException {
        if (this.vector.length != v.vector.length) {
            throw new VectorSizeMismatchException(
                    "Size Mismatch: Both vectors must be of same length");
        }
    }

    public VectorOperations add(VectorOperations v) throws VectorSizeMismatchException {
        checkSize(v);

        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            result[i] = this.vector[i] + v.vector[i];
        }

        return new VectorOperations(result);
    }

    public VectorOperations subtract(VectorOperations v) throws VectorSizeMismatchException {
        checkSize(v);

        double[] result = new double[vector.length];
        for (int i = 0; i < vector.length; i++) {
            result[i] = this.vector[i] - v.vector[i];
        }

        return new VectorOperations(result);
    }

    public double dotProduct(VectorOperations v) throws VectorSizeMismatchException {
        checkSize(v);

        double sum = 0;
        for (int i = 0; i < vector.length; i++) {
            sum += this.vector[i] * v.vector[i];
        }

        return sum;
    }

    public void display() {
        for (double val : vector) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}