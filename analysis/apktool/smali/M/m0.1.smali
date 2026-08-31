.class public final LM/m0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/f;


# static fields
.field public static final q:LM/m0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LM/m0;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LM/m0;->q:LM/m0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Lz0/E;

    .line 2
    .line 3
    check-cast p2, Lz0/B;

    .line 4
    .line 5
    check-cast p3, LW0/a;

    .line 6
    .line 7
    iget-wide v0, p3, LW0/a;->a:J

    .line 8
    .line 9
    sget p3, LM/q0;->a:F

    .line 10
    .line 11
    invoke-interface {p1, p3}, LW0/c;->G(F)I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    mul-int/lit8 v2, p3, 0x2

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v3, v2, v0, v1}, LW0/b;->h(IIJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-interface {p2, v0, v1}, Lz0/B;->a(J)Lz0/J;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget v0, p2, Lz0/J;->r:I

    .line 27
    .line 28
    sub-int/2addr v0, v2

    .line 29
    iget v1, p2, Lz0/J;->q:I

    .line 30
    .line 31
    new-instance v2, LD/v;

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-direct {v2, p3, v3, p2}, LD/v;-><init>(IILjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object p2, Ln5/t;->q:Ln5/t;

    .line 38
    .line 39
    invoke-interface {p1, v1, v0, p2, v2}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    return-object p1
.end method
