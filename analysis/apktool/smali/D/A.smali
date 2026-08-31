.class public abstract LD/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LD/o;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v5, LC/B;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {v5, v0}, LC/B;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/I1;->B()LW0/d;

    .line 8
    .line 9
    .line 10
    move-result-object v9

    .line 11
    sget-object v0, Lq5/i;->q:Lq5/i;

    .line 12
    .line 13
    invoke-static {v0}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 14
    .line 15
    .line 16
    move-result-object v8

    .line 17
    new-instance v0, LD/o;

    .line 18
    .line 19
    sget-object v11, LD/n;->t:LD/n;

    .line 20
    .line 21
    const/16 v17, 0x0

    .line 22
    .line 23
    const/16 v18, 0x0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v10, 0x0

    .line 32
    sget-object v12, Ln5/s;->q:Ln5/s;

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x0

    .line 36
    const/4 v15, 0x0

    .line 37
    sget-object v16, Lw/d0;->q:Lw/d0;

    .line 38
    .line 39
    invoke-direct/range {v0 .. v18}, LD/o;-><init>(LD/q;IZFLz0/D;FZLM5/w;LW0/c;ILB5/c;Ljava/util/List;IIILw/d0;II)V

    .line 40
    .line 41
    .line 42
    sput-object v0, LD/A;->a:LD/o;

    .line 43
    .line 44
    return-void
.end method
