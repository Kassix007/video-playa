.class public final Lw/D0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Lw/H0;

.field public r:Lkotlin/jvm/internal/x;

.field public s:J

.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lw/H0;

.field public final synthetic w:Lkotlin/jvm/internal/x;

.field public final synthetic x:J


# direct methods
.method public constructor <init>(Lw/H0;Lkotlin/jvm/internal/x;JLq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/D0;->v:Lw/H0;

    .line 2
    .line 3
    iput-object p2, p0, Lw/D0;->w:Lkotlin/jvm/internal/x;

    .line 4
    .line 5
    iput-wide p3, p0, Lw/D0;->x:J

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, Lw/D0;

    .line 2
    .line 3
    iget-object v2, p0, Lw/D0;->w:Lkotlin/jvm/internal/x;

    .line 4
    .line 5
    iget-wide v3, p0, Lw/D0;->x:J

    .line 6
    .line 7
    iget-object v1, p0, Lw/D0;->v:Lw/H0;

    .line 8
    .line 9
    move-object v5, p2

    .line 10
    invoke-direct/range {v0 .. v5}, Lw/D0;-><init>(Lw/H0;Lkotlin/jvm/internal/x;JLq5/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, Lw/D0;->u:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/E0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/D0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/D0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/D0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lw/D0;->t:I

    .line 2
    .line 3
    sget-object v1, Lw/d0;->r:Lw/d0;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    iget-wide v3, p0, Lw/D0;->s:J

    .line 11
    .line 12
    iget-object v0, p0, Lw/D0;->r:Lkotlin/jvm/internal/x;

    .line 13
    .line 14
    iget-object v5, p0, Lw/D0;->q:Lw/H0;

    .line 15
    .line 16
    iget-object v6, p0, Lw/D0;->u:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v6, Lw/H0;

    .line 19
    .line 20
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lw/D0;->u:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lw/E0;

    .line 38
    .line 39
    new-instance v0, Lw/C0;

    .line 40
    .line 41
    iget-object v5, p0, Lw/D0;->v:Lw/H0;

    .line 42
    .line 43
    invoke-direct {v0, v5, p1}, Lw/C0;-><init>(Lw/H0;Lw/E0;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, v5, Lw/H0;->c:Lw/I;

    .line 47
    .line 48
    iget-object v3, p0, Lw/D0;->w:Lkotlin/jvm/internal/x;

    .line 49
    .line 50
    iget-wide v6, v3, Lkotlin/jvm/internal/x;->q:J

    .line 51
    .line 52
    iget-object v4, v5, Lw/H0;->d:Lw/d0;

    .line 53
    .line 54
    iget-wide v8, p0, Lw/D0;->x:J

    .line 55
    .line 56
    if-ne v4, v1, :cond_2

    .line 57
    .line 58
    invoke-static {v8, v9}, LW0/p;->b(J)F

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-static {v8, v9}, LW0/p;->c(J)F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    :goto_0
    invoke-virtual {v5, v4}, Lw/H0;->d(F)F

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    iput-object v5, p0, Lw/D0;->u:Ljava/lang/Object;

    .line 72
    .line 73
    iput-object v5, p0, Lw/D0;->q:Lw/H0;

    .line 74
    .line 75
    iput-object v3, p0, Lw/D0;->r:Lkotlin/jvm/internal/x;

    .line 76
    .line 77
    iput-wide v6, p0, Lw/D0;->s:J

    .line 78
    .line 79
    iput v2, p0, Lw/D0;->t:I

    .line 80
    .line 81
    invoke-interface {p1, v0, v4, p0}, Lw/I;->a(Lw/C0;FLq5/c;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 86
    .line 87
    if-ne p1, v0, :cond_3

    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_3
    move-object v0, v3

    .line 91
    move-wide v3, v6

    .line 92
    move-object v6, v5

    .line 93
    :goto_1
    check-cast p1, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {v6, p1}, Lw/H0;->d(F)F

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iget-object v5, v5, Lw/H0;->d:Lw/d0;

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    if-ne v5, v1, :cond_4

    .line 107
    .line 108
    const/4 v1, 0x2

    .line 109
    invoke-static {v3, v4, p1, v6, v1}, LW0/p;->a(JFFI)J

    .line 110
    .line 111
    .line 112
    move-result-wide v1

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    invoke-static {v3, v4, v6, p1, v2}, LW0/p;->a(JFFI)J

    .line 115
    .line 116
    .line 117
    move-result-wide v1

    .line 118
    :goto_2
    iput-wide v1, v0, Lkotlin/jvm/internal/x;->q:J

    .line 119
    .line 120
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 121
    .line 122
    return-object p1
.end method
