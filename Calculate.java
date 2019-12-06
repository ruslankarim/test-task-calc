package com.company.ruslan_karimov;

 class Calculate {
    int execute(int[] arr, String operator) throws IllegalArgumentException {
        int result = 0;
        switch (operator) {
            case ("+"):
                result = arr[0] + arr[1];
                break;
            case ("-"):
                result = arr[0] - arr[1];
                break;
            case ("/"):
                result = arr[0] / arr[1];
                break;
            case ("*"):
                result = arr[0] * arr[1];
                break;
            default:
                    throw new IllegalArgumentException();
        }
        return result;
    }
}
