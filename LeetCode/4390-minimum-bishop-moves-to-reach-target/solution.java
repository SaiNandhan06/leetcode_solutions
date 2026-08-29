class Solution {
    private boolean sameColor(int sr1,int sr2,int tr1,int tr2){
        return (sr1 + sr2) % 2 == (tr1 + tr2 ) % 2;
    }
    private boolean sameDiagonal(int sr1,int sr2,int tr1,int tr2){
        return (sr1 - sr2) == (tr1 - tr2) || (sr1 + sr2) == (tr1 + tr2);
    }
    
    public int minBishopMoves(int[] source, int[] target) {
        int sr1 = source[0];
        int sr2 = source[1];

        int tr1 = target[0];
        int tr2 = target[1];

        if(!sameColor(sr1,sr2,tr1,tr2)) return -1;
        if(sameDiagonal(sr1,sr2,tr1,tr2)) return 1;

        return 2;
    }
}
