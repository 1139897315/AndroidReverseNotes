package a.i.b.a.c.i.b;

import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.s;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.a;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class v extends x<Long> {
    public v(long j) {
        super(Long.valueOf(j));
        AppMethodBeat.i(122122);
        AppMethodBeat.o(122122);
    }

    public final w b(y yVar) {
        ad dZf;
        w wVar;
        AppMethodBeat.i(122120);
        j.p(yVar, "module");
        a aVar = g.Bag.BbE;
        j.o(aVar, "KotlinBuiltIns.FQ_NAMES.uLong");
        e a = s.a(yVar, aVar);
        if (a != null) {
            dZf = a.dZf();
            if (dZf != null) {
                wVar = dZf;
                AppMethodBeat.o(122120);
                return wVar;
            }
        }
        dZf = p.awn("Unsigned type ULong not found");
        j.o(dZf, "ErrorUtils.createErrorTy…ed type ULong not found\")");
        wVar = dZf;
        AppMethodBeat.o(122120);
        return wVar;
    }

    public final String toString() {
        AppMethodBeat.i(122121);
        String str = ((Number) getValue()).longValue() + ".toULong()";
        AppMethodBeat.o(122121);
        return str;
    }
}
