.class public final Lw/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/a;


# instance fields
.field public final q:Lw/H0;

.field public r:Z


# direct methods
.method public constructor <init>(Lw/H0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/r0;->q:Lw/H0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lw/r0;->r:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final F(IJJ)J
    .locals 0

    .line 1
    iget-boolean p1, p0, Lw/r0;->r:Z

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lw/r0;->q:Lw/H0;

    .line 6
    .line 7
    iget-object p2, p1, Lw/H0;->a:Lw/A0;

    .line 8
    .line 9
    invoke-interface {p2}, Lw/A0;->b()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p2, p1, Lw/H0;->a:Lw/A0;

    .line 17
    .line 18
    invoke-virtual {p1, p4, p5}, Lw/H0;->g(J)F

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-virtual {p1, p3}, Lw/H0;->d(F)F

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-interface {p2, p3}, Lw/A0;->d(F)F

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    invoke-virtual {p1, p2}, Lw/H0;->d(F)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {p1, p2}, Lw/H0;->h(F)J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    return-wide p1

    .line 39
    :cond_1
    :goto_0
    const-wide/16 p1, 0x0

    .line 40
    .line 41
    return-wide p1
.end method

.method public final n(JJLq5/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    instance-of p1, p5, Lw/q0;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move-object p1, p5

    .line 6
    check-cast p1, Lw/q0;

    .line 7
    .line 8
    iget p2, p1, Lw/q0;->t:I

    .line 9
    .line 10
    const/high16 v0, -0x80000000

    .line 11
    .line 12
    and-int v1, p2, v0

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    sub-int/2addr p2, v0

    .line 17
    iput p2, p1, Lw/q0;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Lw/q0;

    .line 21
    .line 22
    check-cast p5, Ls5/c;

    .line 23
    .line 24
    invoke-direct {p1, p0, p5}, Lw/q0;-><init>(Lw/r0;Ls5/c;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, p1, Lw/q0;->r:Ljava/lang/Object;

    .line 28
    .line 29
    iget p5, p1, Lw/q0;->t:I

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    if-eqz p5, :cond_3

    .line 33
    .line 34
    if-eq p5, v0, :cond_2

    .line 35
    .line 36
    const/4 p3, 0x2

    .line 37
    if-ne p5, p3, :cond_1

    .line 38
    .line 39
    iget-wide p3, p1, Lw/q0;->q:J

    .line 40
    .line 41
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p2, LW0/p;

    .line 45
    .line 46
    iget-wide p1, p2, LW0/p;->a:J

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-wide p3, p1, Lw/q0;->q:J

    .line 58
    .line 59
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-boolean p2, p0, Lw/r0;->r:Z

    .line 67
    .line 68
    const-wide/16 v1, 0x0

    .line 69
    .line 70
    if-eqz p2, :cond_6

    .line 71
    .line 72
    iget-object p2, p0, Lw/r0;->q:Lw/H0;

    .line 73
    .line 74
    iget-boolean p5, p2, Lw/H0;->h:Z

    .line 75
    .line 76
    if-eqz p5, :cond_4

    .line 77
    .line 78
    move-wide p1, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    iput-wide p3, p1, Lw/q0;->q:J

    .line 81
    .line 82
    iput v0, p1, Lw/q0;->t:I

    .line 83
    .line 84
    invoke-virtual {p2, p3, p4, p1}, Lw/H0;->b(JLs5/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 89
    .line 90
    if-ne p2, p1, :cond_5

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_5
    :goto_1
    check-cast p2, LW0/p;

    .line 94
    .line 95
    iget-wide p1, p2, LW0/p;->a:J

    .line 96
    .line 97
    :goto_2
    invoke-static {p3, p4, p1, p2}, LW0/p;->d(JJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    :cond_6
    new-instance p1, LW0/p;

    .line 102
    .line 103
    invoke-direct {p1, v1, v2}, LW0/p;-><init>(J)V

    .line 104
    .line 105
    .line 106
    return-object p1
.end method
