package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class azo extends a {
    public String Title;
    public int vEq;
    public String wDw;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(11786);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.wDw != null) {
                aVar.e(1, this.wDw);
            }
            if (this.Title != null) {
                aVar.e(2, this.Title);
            }
            aVar.iz(3, this.vEq);
            AppMethodBeat.o(11786);
            return 0;
        } else if (i == 1) {
            if (this.wDw != null) {
                f = e.a.a.b.b.a.f(1, this.wDw) + 0;
            } else {
                f = 0;
            }
            if (this.Title != null) {
                f += e.a.a.b.b.a.f(2, this.Title);
            }
            int bs = f + e.a.a.b.b.a.bs(3, this.vEq);
            AppMethodBeat.o(11786);
            return bs;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(11786);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            azo azo = (azo) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    azo.wDw = aVar3.BTU.readString();
                    AppMethodBeat.o(11786);
                    return 0;
                case 2:
                    azo.Title = aVar3.BTU.readString();
                    AppMethodBeat.o(11786);
                    return 0;
                case 3:
                    azo.vEq = aVar3.BTU.vd();
                    AppMethodBeat.o(11786);
                    return 0;
                default:
                    AppMethodBeat.o(11786);
                    return -1;
            }
        } else {
            AppMethodBeat.o(11786);
            return -1;
        }
    }
}
