.class public final LP5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP5/h;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LP5/h;

.field public final synthetic s:Lm5/e;


# direct methods
.method public constructor <init>(LP5/h;LB5/e;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LP5/r;->q:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LP5/r;->r:LP5/h;

    check-cast p2, Ls5/i;

    iput-object p2, p0, LP5/r;->s:Lm5/e;

    return-void
.end method

.method public synthetic constructor <init>(LP5/h;Lm5/e;I)V
    .locals 0

    .line 1
    iput p3, p0, LP5/r;->q:I

    iput-object p1, p0, LP5/r;->r:LP5/h;

    iput-object p2, p0, LP5/r;->s:Lm5/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final collect(LP5/i;Lq5/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, LP5/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LL/e;

    .line 7
    .line 8
    iget-object v1, p0, LP5/r;->s:Lm5/e;

    .line 9
    .line 10
    check-cast v1, Ls5/i;

    .line 11
    .line 12
    invoke-direct {v0, p1, v1}, LL/e;-><init>(LP5/i;LB5/e;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, LP5/r;->r:LP5/h;

    .line 16
    .line 17
    invoke-interface {p1, v0, p2}, LP5/h;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 22
    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    :goto_0
    return-object p1

    .line 29
    :pswitch_0
    new-instance v0, Lkotlin/jvm/internal/u;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LP5/r;->r:LP5/h;

    .line 35
    .line 36
    check-cast v1, LQ5/o;

    .line 37
    .line 38
    new-instance v2, LN/f;

    .line 39
    .line 40
    iget-object v3, p0, LP5/r;->s:Lm5/e;

    .line 41
    .line 42
    check-cast v3, LP5/N;

    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-direct {v2, v0, p1, v3, v4}, LN/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2, p2}, LQ5/i;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    sget-object p2, Lr5/a;->q:Lr5/a;

    .line 53
    .line 54
    if-ne p1, p2, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 58
    .line 59
    :goto_1
    return-object p1

    .line 60
    :pswitch_1
    instance-of v0, p2, LP5/q;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    move-object v0, p2

    .line 65
    check-cast v0, LP5/q;

    .line 66
    .line 67
    iget v1, v0, LP5/q;->r:I

    .line 68
    .line 69
    const/high16 v2, -0x80000000

    .line 70
    .line 71
    and-int v3, v1, v2

    .line 72
    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    sub-int/2addr v1, v2

    .line 76
    iput v1, v0, LP5/q;->r:I

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    new-instance v0, LP5/q;

    .line 80
    .line 81
    invoke-direct {v0, p0, p2}, LP5/q;-><init>(LP5/r;Lq5/c;)V

    .line 82
    .line 83
    .line 84
    :goto_2
    iget-object p2, v0, LP5/q;->q:Ljava/lang/Object;

    .line 85
    .line 86
    iget v1, v0, LP5/q;->r:I

    .line 87
    .line 88
    const/4 v2, 0x2

    .line 89
    const/4 v3, 0x1

    .line 90
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 91
    .line 92
    if-eqz v1, :cond_5

    .line 93
    .line 94
    if-eq v1, v3, :cond_4

    .line 95
    .line 96
    if-ne v1, v2, :cond_3

    .line 97
    .line 98
    iget-wide v5, v0, LP5/q;->w:J

    .line 99
    .line 100
    iget-object p1, v0, LP5/q;->v:Ljava/lang/Throwable;

    .line 101
    .line 102
    iget-object v1, v0, LP5/q;->u:LP5/i;

    .line 103
    .line 104
    iget-object v7, v0, LP5/q;->t:LP5/r;

    .line 105
    .line 106
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 111
    .line 112
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 113
    .line 114
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :cond_4
    iget-wide v5, v0, LP5/q;->w:J

    .line 119
    .line 120
    iget-object p1, v0, LP5/q;->u:LP5/i;

    .line 121
    .line 122
    iget-object v1, v0, LP5/q;->t:LP5/r;

    .line 123
    .line 124
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move-object v7, v1

    .line 128
    :goto_3
    move-object v1, p1

    .line 129
    goto :goto_5

    .line 130
    :cond_5
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    const-wide/16 v5, 0x0

    .line 134
    .line 135
    move-object p2, p0

    .line 136
    :goto_4
    iget-object v1, p2, LP5/r;->r:LP5/h;

    .line 137
    .line 138
    iput-object p2, v0, LP5/q;->t:LP5/r;

    .line 139
    .line 140
    iput-object p1, v0, LP5/q;->u:LP5/i;

    .line 141
    .line 142
    const/4 v7, 0x0

    .line 143
    iput-object v7, v0, LP5/q;->v:Ljava/lang/Throwable;

    .line 144
    .line 145
    iput-wide v5, v0, LP5/q;->w:J

    .line 146
    .line 147
    iput v3, v0, LP5/q;->r:I

    .line 148
    .line 149
    invoke-static {v1, p1, v0}, LP5/H;->f(LP5/h;LP5/i;Ls5/c;)Ljava/io/Serializable;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-ne v1, v4, :cond_6

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_6
    move-object v7, p2

    .line 157
    move-object p2, v1

    .line 158
    goto :goto_3

    .line 159
    :goto_5
    move-object p1, p2

    .line 160
    check-cast p1, Ljava/lang/Throwable;

    .line 161
    .line 162
    if-eqz p1, :cond_9

    .line 163
    .line 164
    iget-object p2, v7, LP5/r;->s:Lm5/e;

    .line 165
    .line 166
    check-cast p2, LB5/g;

    .line 167
    .line 168
    new-instance v8, Ljava/lang/Long;

    .line 169
    .line 170
    invoke-direct {v8, v5, v6}, Ljava/lang/Long;-><init>(J)V

    .line 171
    .line 172
    .line 173
    iput-object v7, v0, LP5/q;->t:LP5/r;

    .line 174
    .line 175
    iput-object v1, v0, LP5/q;->u:LP5/i;

    .line 176
    .line 177
    iput-object p1, v0, LP5/q;->v:Ljava/lang/Throwable;

    .line 178
    .line 179
    iput-wide v5, v0, LP5/q;->w:J

    .line 180
    .line 181
    iput v2, v0, LP5/q;->r:I

    .line 182
    .line 183
    invoke-interface {p2, v1, p1, v8, v0}, LB5/g;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    if-ne p2, v4, :cond_7

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_7
    :goto_6
    check-cast p2, Ljava/lang/Boolean;

    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    if-eqz p2, :cond_8

    .line 197
    .line 198
    const-wide/16 p1, 0x1

    .line 199
    .line 200
    add-long/2addr v5, p1

    .line 201
    move p1, v3

    .line 202
    :goto_7
    move-object p2, v7

    .line 203
    goto :goto_8

    .line 204
    :cond_8
    throw p1

    .line 205
    :cond_9
    const/4 p1, 0x0

    .line 206
    goto :goto_7

    .line 207
    :goto_8
    if-nez p1, :cond_a

    .line 208
    .line 209
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 210
    .line 211
    :goto_9
    return-object v4

    .line 212
    :cond_a
    move-object p1, v1

    .line 213
    goto :goto_4

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
