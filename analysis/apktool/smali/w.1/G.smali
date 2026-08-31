.class public final Lw/G;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:I

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lw/H;

.field public final synthetic t:J


# direct methods
.method public constructor <init>(Lw/H;JLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/G;->s:Lw/H;

    .line 2
    .line 3
    iput-wide p2, p0, Lw/G;->t:J

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 4

    .line 1
    new-instance v0, Lw/G;

    .line 2
    .line 3
    iget-object v1, p0, Lw/G;->s:Lw/H;

    .line 4
    .line 5
    iget-wide v2, p0, Lw/G;->t:J

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, v3, p2}, Lw/G;-><init>(Lw/H;JLq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lw/G;->r:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/G;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/G;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/G;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lw/G;->q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lw/G;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, LM5/w;

    .line 26
    .line 27
    iget-object v0, p0, Lw/G;->s:Lw/H;

    .line 28
    .line 29
    iget-object v2, v0, Lw/H;->S:LB5/f;

    .line 30
    .line 31
    iget-wide v3, p0, Lw/G;->t:J

    .line 32
    .line 33
    const/16 v5, 0x20

    .line 34
    .line 35
    shr-long v6, v3, v5

    .line 36
    .line 37
    long-to-int v6, v6

    .line 38
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/high16 v7, 0x3f800000    # 1.0f

    .line 43
    .line 44
    mul-float/2addr v6, v7

    .line 45
    const-wide v8, 0xffffffffL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    and-long/2addr v3, v8

    .line 51
    long-to-int v3, v3

    .line 52
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    mul-float/2addr v3, v7

    .line 57
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    int-to-long v6, v4

    .line 62
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    int-to-long v3, v3

    .line 67
    shl-long v5, v6, v5

    .line 68
    .line 69
    and-long/2addr v3, v8

    .line 70
    or-long/2addr v3, v5

    .line 71
    iget-object v0, v0, Lw/H;->P:Lw/d0;

    .line 72
    .line 73
    sget-object v5, Lw/D;->a:Le3/u;

    .line 74
    .line 75
    sget-object v5, Lw/d0;->q:Lw/d0;

    .line 76
    .line 77
    if-ne v0, v5, :cond_2

    .line 78
    .line 79
    invoke-static {v3, v4}, LW0/p;->c(J)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-static {v3, v4}, LW0/p;->b(J)F

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    :goto_0
    new-instance v3, Ljava/lang/Float;

    .line 89
    .line 90
    invoke-direct {v3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 91
    .line 92
    .line 93
    iput v1, p0, Lw/G;->q:I

    .line 94
    .line 95
    invoke-interface {v2, p1, v3, p0}, LB5/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 100
    .line 101
    if-ne p1, v0, :cond_3

    .line 102
    .line 103
    return-object v0

    .line 104
    :cond_3
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 105
    .line 106
    return-object p1
.end method
