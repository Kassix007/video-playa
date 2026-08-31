.class public final Lw/V;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Lb2/a;

.field public final synthetic r:Lkotlin/jvm/internal/y;

.field public final synthetic s:Lkotlin/jvm/internal/v;

.field public final synthetic t:Lw/H0;

.field public final synthetic u:Lkotlin/jvm/internal/u;


# direct methods
.method public constructor <init>(Lb2/a;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/v;Lw/H0;Lkotlin/jvm/internal/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/V;->q:Lb2/a;

    .line 2
    .line 3
    iput-object p2, p0, Lw/V;->r:Lkotlin/jvm/internal/y;

    .line 4
    .line 5
    iput-object p3, p0, Lw/V;->s:Lkotlin/jvm/internal/v;

    .line 6
    .line 7
    iput-object p4, p0, Lw/V;->t:Lw/H0;

    .line 8
    .line 9
    iput-object p5, p0, Lw/V;->u:Lkotlin/jvm/internal/u;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lw/V;->q:Lb2/a;

    .line 8
    .line 9
    iget-object v1, v0, Lb2/a;->f:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, LO5/e;

    .line 12
    .line 13
    invoke-static {v1}, Lb2/a;->f(LO5/e;)Lw/Q;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lb2/a;->g(Lw/Q;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lw/V;->r:Lkotlin/jvm/internal/y;

    .line 24
    .line 25
    iget-object v3, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lw/Q;

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Lw/Q;->a(Lw/Q;)Lw/Q;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iput-object v3, v0, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 34
    .line 35
    iget-wide v3, v3, Lw/Q;->a:J

    .line 36
    .line 37
    iget-object v0, p0, Lw/V;->t:Lw/H0;

    .line 38
    .line 39
    invoke-virtual {v0, v3, v4}, Lw/H0;->e(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    invoke-virtual {v0, v3, v4}, Lw/H0;->g(J)F

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iget-object v3, p0, Lw/V;->s:Lkotlin/jvm/internal/v;

    .line 48
    .line 49
    iput v0, v3, Lkotlin/jvm/internal/v;->q:F

    .line 50
    .line 51
    sub-float/2addr v0, p1

    .line 52
    invoke-static {v0}, Lw/P;->a(F)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    xor-int/2addr p1, v2

    .line 57
    iget-object v0, p0, Lw/V;->u:Lkotlin/jvm/internal/u;

    .line 58
    .line 59
    iput-boolean p1, v0, Lkotlin/jvm/internal/u;->q:Z

    .line 60
    .line 61
    :cond_0
    if-eqz v1, :cond_1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    const/4 v2, 0x0

    .line 65
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
.end method
