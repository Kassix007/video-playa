.class public final LH0/e;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:F

.field public final synthetic s:LH0/f;


# direct methods
.method public constructor <init>(LH0/f;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LH0/e;->s:LH0/f;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 2

    .line 1
    new-instance v0, LH0/e;

    .line 2
    .line 3
    iget-object v1, p0, LH0/e;->s:LH0/f;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LH0/e;-><init>(LH0/f;Lq5/c;)V

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, v0, LH0/e;->r:F

    .line 15
    .line 16
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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
    check-cast p2, Lq5/c;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1, p2}, LH0/e;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, LH0/e;

    .line 18
    .line 19
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, LH0/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LH0/e;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-wide v2, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget p1, p0, LH0/e;->r:F

    .line 29
    .line 30
    iget-object v0, p0, LH0/e;->s:LH0/f;

    .line 31
    .line 32
    iget-object v4, v0, LH0/f;->a:LI0/m;

    .line 33
    .line 34
    iget-object v4, v4, LI0/m;->d:LI0/i;

    .line 35
    .line 36
    sget-object v5, LI0/h;->e:LI0/s;

    .line 37
    .line 38
    iget-object v4, v4, LI0/i;->q:Lr/G;

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Lr/G;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-nez v4, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    :cond_2
    check-cast v4, LB5/e;

    .line 48
    .line 49
    if-eqz v4, :cond_4

    .line 50
    .line 51
    iget-object v0, v0, LH0/f;->a:LI0/m;

    .line 52
    .line 53
    iget-object v0, v0, LI0/m;->d:LI0/i;

    .line 54
    .line 55
    sget-object v5, LI0/p;->t:LI0/s;

    .line 56
    .line 57
    invoke-virtual {v0, v5}, LI0/i;->h(LI0/s;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, LI0/g;

    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    int-to-long v5, v0

    .line 69
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    int-to-long v7, p1

    .line 74
    const/16 p1, 0x20

    .line 75
    .line 76
    shl-long/2addr v5, p1

    .line 77
    and-long/2addr v7, v2

    .line 78
    or-long/2addr v5, v7

    .line 79
    new-instance p1, Li0/b;

    .line 80
    .line 81
    invoke-direct {p1, v5, v6}, Li0/b;-><init>(J)V

    .line 82
    .line 83
    .line 84
    iput v1, p0, LH0/e;->q:I

    .line 85
    .line 86
    invoke-interface {v4, p1, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 91
    .line 92
    if-ne p1, v0, :cond_3

    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_3
    :goto_0
    check-cast p1, Li0/b;

    .line 96
    .line 97
    iget-wide v0, p1, Li0/b;->a:J

    .line 98
    .line 99
    and-long/2addr v0, v2

    .line 100
    long-to-int p1, v0

    .line 101
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    new-instance v0, Ljava/lang/Float;

    .line 106
    .line 107
    invoke-direct {v0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_4
    const-string p1, "Required value was null."

    .line 112
    .line 113
    invoke-static {p1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    throw p1
.end method
