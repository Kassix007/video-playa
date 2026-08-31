.class public final Lu/G;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Lkotlin/jvm/internal/v;

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:LP/W;

.field public final synthetic u:Lu/H;


# direct methods
.method public constructor <init>(LP/W;Lu/H;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/G;->t:LP/W;

    .line 2
    .line 3
    iput-object p2, p0, Lu/G;->u:Lu/H;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, Lu/G;

    .line 2
    .line 3
    iget-object v1, p0, Lu/G;->t:LP/W;

    .line 4
    .line 5
    iget-object v2, p0, Lu/G;->u:Lu/H;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lu/G;-><init>(LP/W;Lu/H;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lu/G;->s:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lu/G;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu/G;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu/G;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lr5/a;->q:Lr5/a;

    .line 17
    .line 18
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lu/G;->r:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    sget-object v3, Lr5/a;->q:Lr5/a;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lu/G;->q:Lkotlin/jvm/internal/v;

    .line 14
    .line 15
    iget-object v4, p0, Lu/G;->s:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, LM5/w;

    .line 18
    .line 19
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object v8, v0

    .line 23
    move-object v9, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-object v0, p0, Lu/G;->q:Lkotlin/jvm/internal/v;

    .line 34
    .line 35
    iget-object v4, p0, Lu/G;->s:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, LM5/w;

    .line 38
    .line 39
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object v8, v0

    .line 43
    move-object v9, v4

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lu/G;->s:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, LM5/w;

    .line 51
    .line 52
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    const/high16 v4, 0x3f800000    # 1.0f

    .line 58
    .line 59
    iput v4, v0, Lkotlin/jvm/internal/v;->q:F

    .line 60
    .line 61
    move-object v9, p1

    .line 62
    move-object v8, v0

    .line 63
    :cond_3
    :goto_0
    new-instance v5, LE/y;

    .line 64
    .line 65
    iget-object v7, p0, Lu/G;->u:Lu/H;

    .line 66
    .line 67
    const/4 v10, 0x1

    .line 68
    iget-object v6, p0, Lu/G;->t:LP/W;

    .line 69
    .line 70
    invoke-direct/range {v5 .. v10}, LE/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    iput-object v9, p0, Lu/G;->s:Ljava/lang/Object;

    .line 74
    .line 75
    iput-object v8, p0, Lu/G;->q:Lkotlin/jvm/internal/v;

    .line 76
    .line 77
    iput v1, p0, Lu/G;->r:I

    .line 78
    .line 79
    invoke-static {v5, p0}, Lu/d;->r(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-ne p1, v3, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    :goto_1
    iget p1, v8, Lkotlin/jvm/internal/v;->q:F

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    cmpg-float p1, p1, v0

    .line 90
    .line 91
    if-nez p1, :cond_3

    .line 92
    .line 93
    new-instance p1, LA0/d;

    .line 94
    .line 95
    const/16 v0, 0x19

    .line 96
    .line 97
    invoke-direct {p1, v0, v9}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, LP/Q0;

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    invoke-direct {v0, p1, v4}, LP/Q0;-><init>(LB5/a;Lq5/c;)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Lu2/m;

    .line 107
    .line 108
    invoke-direct {p1, v0}, Lu2/m;-><init>(LB5/e;)V

    .line 109
    .line 110
    .line 111
    new-instance v0, Lu/F;

    .line 112
    .line 113
    invoke-direct {v0, v2, v4}, Ls5/i;-><init>(ILq5/c;)V

    .line 114
    .line 115
    .line 116
    iput-object v9, p0, Lu/G;->s:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v8, p0, Lu/G;->q:Lkotlin/jvm/internal/v;

    .line 119
    .line 120
    iput v2, p0, Lu/G;->r:I

    .line 121
    .line 122
    invoke-static {p1, v0, p0}, LP5/H;->i(LP5/h;LB5/e;Ls5/c;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    if-ne p1, v3, :cond_3

    .line 127
    .line 128
    :goto_2
    return-object v3
.end method
