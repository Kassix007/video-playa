.class public final LP5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/i;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LP5/i;

.field public final synthetic s:Lkotlin/jvm/internal/y;


# direct methods
.method public constructor <init>(LP5/g;Lkotlin/jvm/internal/y;LP5/i;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, LP5/f;->q:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LP5/f;->s:Lkotlin/jvm/internal/y;

    iput-object p3, p0, LP5/f;->r:LP5/i;

    return-void
.end method

.method public constructor <init>(LP5/i;Lkotlin/jvm/internal/y;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LP5/f;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP5/f;->r:LP5/i;

    iput-object p2, p0, LP5/f;->s:Lkotlin/jvm/internal/y;

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LP5/f;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LP5/p;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, LP5/p;

    .line 12
    .line 13
    iget v1, v0, LP5/p;->t:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, LP5/p;->t:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LP5/p;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, LP5/p;-><init>(LP5/f;Lq5/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, LP5/p;->r:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, LP5/p;->t:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, LP5/p;->q:LP5/f;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p2

    .line 46
    goto :goto_3

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :try_start_1
    iget-object p2, p0, LP5/f;->r:LP5/i;

    .line 59
    .line 60
    iput-object p0, v0, LP5/p;->q:LP5/f;

    .line 61
    .line 62
    iput v2, v0, LP5/p;->t:I

    .line 63
    .line 64
    invoke-interface {p2, p1, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 69
    .line 70
    if-ne p1, p2, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    :goto_1
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 74
    .line 75
    :goto_2
    return-object p2

    .line 76
    :catchall_1
    move-exception p2

    .line 77
    move-object p1, p0

    .line 78
    :goto_3
    iget-object p1, p1, LP5/f;->s:Lkotlin/jvm/internal/y;

    .line 79
    .line 80
    iput-object p2, p1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 81
    .line 82
    throw p2

    .line 83
    :pswitch_0
    instance-of v0, p2, LP5/e;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    move-object v0, p2

    .line 88
    check-cast v0, LP5/e;

    .line 89
    .line 90
    iget v1, v0, LP5/e;->s:I

    .line 91
    .line 92
    const/high16 v2, -0x80000000

    .line 93
    .line 94
    and-int v3, v1, v2

    .line 95
    .line 96
    if-eqz v3, :cond_4

    .line 97
    .line 98
    sub-int/2addr v1, v2

    .line 99
    iput v1, v0, LP5/e;->s:I

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_4
    new-instance v0, LP5/e;

    .line 103
    .line 104
    invoke-direct {v0, p0, p2}, LP5/e;-><init>(LP5/f;Lq5/c;)V

    .line 105
    .line 106
    .line 107
    :goto_4
    iget-object p2, v0, LP5/e;->q:Ljava/lang/Object;

    .line 108
    .line 109
    iget v1, v0, LP5/e;->s:I

    .line 110
    .line 111
    sget-object v2, Lm5/y;->a:Lm5/y;

    .line 112
    .line 113
    const/4 v3, 0x1

    .line 114
    if-eqz v1, :cond_6

    .line 115
    .line 116
    if-ne v1, v3, :cond_5

    .line 117
    .line 118
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 123
    .line 124
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 125
    .line 126
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :cond_6
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object p2, p0, LP5/f;->s:Lkotlin/jvm/internal/y;

    .line 134
    .line 135
    iget-object v1, p2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 136
    .line 137
    sget-object v4, LQ5/c;->b:LE4/f;

    .line 138
    .line 139
    if-eq v1, v4, :cond_7

    .line 140
    .line 141
    invoke-static {v1, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_8

    .line 146
    .line 147
    :cond_7
    iput-object p1, p2, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 148
    .line 149
    iput v3, v0, LP5/e;->s:I

    .line 150
    .line 151
    iget-object p2, p0, LP5/f;->r:LP5/i;

    .line 152
    .line 153
    invoke-interface {p2, p1, v0}, LP5/i;->emit(Ljava/lang/Object;Lq5/c;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 158
    .line 159
    if-ne p1, p2, :cond_8

    .line 160
    .line 161
    move-object v2, p2

    .line 162
    :cond_8
    :goto_5
    return-object v2

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
