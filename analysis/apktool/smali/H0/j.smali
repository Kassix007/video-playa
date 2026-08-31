.class public final LH0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:LH0/e;

.field public c:F


# direct methods
.method public constructor <init>(ILH0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LH0/j;->a:I

    .line 5
    .line 6
    iput-object p2, p0, LH0/j;->b:LH0/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(FLs5/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LH0/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LH0/i;

    .line 7
    .line 8
    iget v1, v0, LH0/i;->t:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LH0/i;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LH0/i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LH0/i;-><init>(LH0/j;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LH0/i;->r:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, LH0/i;->t:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, LH0/i;->q:LH0/j;

    .line 35
    .line 36
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Ljava/lang/Float;

    .line 52
    .line 53
    invoke-direct {p2, p1}, Ljava/lang/Float;-><init>(F)V

    .line 54
    .line 55
    .line 56
    iput-object p0, v0, LH0/i;->q:LH0/j;

    .line 57
    .line 58
    iput v2, v0, LH0/i;->t:I

    .line 59
    .line 60
    iget-object p1, p0, LH0/j;->b:LH0/e;

    .line 61
    .line 62
    invoke-virtual {p1, p2, v0}, LH0/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 67
    .line 68
    if-ne p2, p1, :cond_3

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_3
    move-object p1, p0

    .line 72
    :goto_1
    check-cast p2, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    iget v0, p1, LH0/j;->c:F

    .line 79
    .line 80
    add-float/2addr v0, p2

    .line 81
    iput v0, p1, LH0/j;->c:F

    .line 82
    .line 83
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 84
    .line 85
    return-object p1
.end method
