.class public final LC0/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/T;


# instance fields
.field public final synthetic q:I

.field public final r:Ljava/lang/Object;

.field public final s:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LP/T;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LC0/h0;->q:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC0/h0;->r:Ljava/lang/Object;

    .line 5
    new-instance p1, LK2/a;

    invoke-direct {p1}, LK2/a;-><init>()V

    iput-object p1, p0, LC0/h0;->s:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/Choreographer;LC0/f0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LC0/h0;->q:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LC0/h0;->r:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LC0/h0;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(LB5/c;Ls5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LC0/h0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, LP/g0;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, LP/g0;

    .line 12
    .line 13
    iget v1, v0, LP/g0;->u:I

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
    iput v1, v0, LP/g0;->u:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LP/g0;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, LP/g0;-><init>(LC0/h0;Ls5/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, LP/g0;->s:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 33
    .line 34
    iget v2, v0, LP/g0;->u:I

    .line 35
    .line 36
    const/4 v3, 0x2

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object p1, v0, LP/g0;->r:LB5/c;

    .line 57
    .line 58
    iget-object v2, v0, LP/g0;->q:LC0/h0;

    .line 59
    .line 60
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p2, p0, LC0/h0;->s:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, LK2/a;

    .line 70
    .line 71
    iput-object p0, v0, LP/g0;->q:LC0/h0;

    .line 72
    .line 73
    iput-object p1, v0, LP/g0;->r:LB5/c;

    .line 74
    .line 75
    iput v4, v0, LP/g0;->u:I

    .line 76
    .line 77
    iget-object v2, p2, LK2/a;->c:Ljava/lang/Object;

    .line 78
    .line 79
    monitor-enter v2

    .line 80
    :try_start_0
    iget-boolean v5, p2, LK2/a;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 81
    .line 82
    monitor-exit v2

    .line 83
    if-eqz v5, :cond_4

    .line 84
    .line 85
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    new-instance v2, LM5/h;

    .line 89
    .line 90
    invoke-static {v0}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-direct {v2, v4, v5}, LM5/h;-><init>(ILq5/c;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, LM5/h;->s()V

    .line 98
    .line 99
    .line 100
    iget-object v4, p2, LK2/a;->c:Ljava/lang/Object;

    .line 101
    .line 102
    monitor-enter v4

    .line 103
    :try_start_1
    iget-object v5, p2, LK2/a;->d:Ljava/io/Serializable;

    .line 104
    .line 105
    check-cast v5, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    monitor-exit v4

    .line 111
    new-instance v4, LA/Y;

    .line 112
    .line 113
    const/16 v5, 0x11

    .line 114
    .line 115
    invoke-direct {v4, v5, p2, v2}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, v4}, LM5/h;->u(LB5/c;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, LM5/h;->r()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    if-ne p2, v1, :cond_5

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_5
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 129
    .line 130
    :goto_1
    if-ne p2, v1, :cond_6

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    move-object v2, p0

    .line 134
    :goto_2
    iget-object p2, v2, LC0/h0;->r:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p2, LP/T;

    .line 137
    .line 138
    const/4 v2, 0x0

    .line 139
    iput-object v2, v0, LP/g0;->q:LC0/h0;

    .line 140
    .line 141
    iput-object v2, v0, LP/g0;->r:LB5/c;

    .line 142
    .line 143
    iput v3, v0, LP/g0;->u:I

    .line 144
    .line 145
    invoke-interface {p2, p1, v0}, LP/T;->e(LB5/c;Ls5/c;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    if-ne p2, v1, :cond_7

    .line 150
    .line 151
    :goto_3
    move-object p2, v1

    .line 152
    :cond_7
    :goto_4
    return-object p2

    .line 153
    :catchall_0
    move-exception p1

    .line 154
    monitor-exit v4

    .line 155
    throw p1

    .line 156
    :catchall_1
    move-exception p1

    .line 157
    monitor-exit v2

    .line 158
    throw p1

    .line 159
    :pswitch_0
    iget-object v0, p0, LC0/h0;->s:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, LC0/f0;

    .line 162
    .line 163
    new-instance v1, LM5/h;

    .line 164
    .line 165
    invoke-static {p2}, Ln5/A;->v(Lq5/c;)Lq5/c;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    const/4 v2, 0x1

    .line 170
    invoke-direct {v1, v2, p2}, LM5/h;-><init>(ILq5/c;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, LM5/h;->s()V

    .line 174
    .line 175
    .line 176
    new-instance p2, LC0/g0;

    .line 177
    .line 178
    invoke-direct {p2, v1, p0, p1}, LC0/g0;-><init>(LM5/h;LC0/h0;LB5/c;)V

    .line 179
    .line 180
    .line 181
    iget-object p1, v0, LC0/f0;->q:Landroid/view/Choreographer;

    .line 182
    .line 183
    iget-object v3, p0, LC0/h0;->r:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v3, Landroid/view/Choreographer;

    .line 186
    .line 187
    invoke-static {p1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_9

    .line 192
    .line 193
    iget-object p1, v0, LC0/f0;->s:Ljava/lang/Object;

    .line 194
    .line 195
    monitor-enter p1

    .line 196
    :try_start_2
    iget-object v3, v0, LC0/f0;->u:Ljava/util/ArrayList;

    .line 197
    .line 198
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    iget-boolean v3, v0, LC0/f0;->x:Z

    .line 202
    .line 203
    if-nez v3, :cond_8

    .line 204
    .line 205
    iput-boolean v2, v0, LC0/f0;->x:Z

    .line 206
    .line 207
    iget-object v2, v0, LC0/f0;->q:Landroid/view/Choreographer;

    .line 208
    .line 209
    iget-object v3, v0, LC0/f0;->y:LC0/e0;

    .line 210
    .line 211
    invoke-virtual {v2, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :catchall_2
    move-exception p2

    .line 216
    goto :goto_6

    .line 217
    :cond_8
    :goto_5
    monitor-exit p1

    .line 218
    new-instance p1, LA/Y;

    .line 219
    .line 220
    const/4 v2, 0x3

    .line 221
    invoke-direct {p1, v2, v0, p2}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, p1}, LM5/h;->u(LB5/c;)V

    .line 225
    .line 226
    .line 227
    goto :goto_7

    .line 228
    :goto_6
    monitor-exit p1

    .line 229
    throw p2

    .line 230
    :cond_9
    iget-object p1, p0, LC0/h0;->r:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p1, Landroid/view/Choreographer;

    .line 233
    .line 234
    invoke-virtual {p1, p2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 235
    .line 236
    .line 237
    new-instance p1, LA/Y;

    .line 238
    .line 239
    const/4 v0, 0x4

    .line 240
    invoke-direct {p1, v0, p0, p2}, LA/Y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, p1}, LM5/h;->u(LB5/c;)V

    .line 244
    .line 245
    .line 246
    :goto_7
    invoke-virtual {v1}, LM5/h;->r()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    return-object p1

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final fold(Ljava/lang/Object;LB5/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LC0/h0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p1, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-interface {p2, p1, p0}, LB5/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get(Lq5/g;)Lq5/f;
    .locals 1

    .line 1
    iget v0, p0, LC0/h0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, LE3/h;->A(Lq5/f;Lq5/g;)Lq5/f;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, LE3/h;->A(Lq5/f;Lq5/g;)Lq5/f;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final minusKey(Lq5/g;)Lq5/h;
    .locals 1

    .line 1
    iget v0, p0, LC0/h0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, LE3/h;->I(Lq5/f;Lq5/g;)Lq5/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, LE3/h;->I(Lq5/f;Lq5/g;)Lq5/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final plus(Lq5/h;)Lq5/h;
    .locals 1

    .line 1
    iget v0, p0, LC0/h0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, LE3/h;->L(Lq5/f;Lq5/h;)Lq5/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    invoke-static {p0, p1}, LE3/h;->L(Lq5/f;Lq5/h;)Lq5/h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
