package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class bzf extends a {
    public int wYj;
    public String wdO;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(28656);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.wdO != null) {
                aVar.e(1, this.wdO);
            }
            aVar.iz(2, this.wYj);
            AppMethodBeat.o(28656);
            return 0;
        } else if (i == 1) {
            if (this.wdO != null) {
                f = e.a.a.b.b.a.f(1, this.wdO) + 0;
            } else {
                f = 0;
            }
            int bs = f + e.a.a.b.b.a.bs(2, this.wYj);
            AppMethodBeat.o(28656);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(28656);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            bzf bzf = (bzf) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bzf.wdO = aVar3.BTU.readString();
                    AppMethodBeat.o(28656);
                    return 0;
                case 2:
                    bzf.wYj = aVar3.BTU.vd();
                    AppMethodBeat.o(28656);
                    return 0;
                default:
                    AppMethodBeat.o(28656);
                    return -1;
            }
        } else {
            AppMethodBeat.o(28656);
            return -1;
        }
    }
}
