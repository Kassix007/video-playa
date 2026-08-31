.class public final synthetic LY4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LY4/d;


# direct methods
.method public synthetic constructor <init>(LY4/d;I)V
    .locals 0

    .line 1
    iput p2, p0, LY4/b;->q:I

    iput-object p1, p0, LY4/b;->r:LY4/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LY4/b;->q:I

    .line 2
    .line 3
    check-cast p1, Ly4/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget v0, p1, Ly4/a;->b:I

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iget-object v1, p0, LY4/b;->r:LY4/d;

    .line 15
    .line 16
    iput-boolean v0, v1, LY4/d;->f:Z

    .line 17
    .line 18
    iget-object v0, v1, LY4/d;->j:Ly4/m;

    .line 19
    .line 20
    invoke-virtual {v1, p1, v0}, LY4/d;->b(Ly4/a;Ly4/m;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 24
    .line 25
    return-object p1

    .line 26
    :pswitch_0
    iget v0, p1, Ly4/a;->b:I

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    iget-object v2, p0, LY4/b;->r:LY4/d;

    .line 30
    .line 31
    const-string v3, "isUpdateAvailable"

    .line 32
    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    iget-object v0, v2, LY4/d;->e:Lorg/json/JSONObject;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v1, "latestVersion"

    .line 42
    .line 43
    iget p1, p1, Ly4/a;->a:I

    .line 44
    .line 45
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    iget-object p1, v2, LY4/d;->c:LR4/Z0;

    .line 49
    .line 50
    invoke-virtual {p1, v0}, LR4/Z0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object p1, v2, LY4/d;->e:Lorg/json/JSONObject;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    invoke-virtual {p1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    iget-object p1, v2, LY4/d;->c:LR4/Z0;

    .line 61
    .line 62
    iget-object v0, v2, LY4/d;->e:Lorg/json/JSONObject;

    .line 63
    .line 64
    invoke-virtual {p1, v0}, LR4/Z0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    :goto_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_1
    iget-object v0, p0, LY4/b;->r:LY4/d;

    .line 71
    .line 72
    iget-object v1, v0, LY4/d;->h:Lk3/c;

    .line 73
    .line 74
    iget-object v2, v1, Lk3/c;->q:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Landroid/content/SharedPreferences;

    .line 77
    .line 78
    const-string v3, "STORED_DATE"

    .line 79
    .line 80
    const-string v4, ""

    .line 81
    .line 82
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    move-object v2, v4

    .line 89
    :cond_2
    invoke-static {v2}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    const/4 v5, 0x2

    .line 94
    if-eqz v2, :cond_3

    .line 95
    .line 96
    iget v1, p1, Ly4/a;->b:I

    .line 97
    .line 98
    if-ne v1, v5, :cond_6

    .line 99
    .line 100
    iget-object v1, v0, LY4/d;->j:Ly4/m;

    .line 101
    .line 102
    invoke-virtual {v0, p1, v1}, LY4/d;->b(Ly4/a;Ly4/m;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_3
    iget-object v2, v1, Lk3/c;->q:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v2, Landroid/content/SharedPreferences;

    .line 109
    .line 110
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-nez v2, :cond_4

    .line 115
    .line 116
    move-object v2, v4

    .line 117
    :cond_4
    invoke-static {v2}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_6

    .line 122
    .line 123
    iget-object v1, v1, Lk3/c;->q:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v1, Landroid/content/SharedPreferences;

    .line 126
    .line 127
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-nez v1, :cond_5

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    move-object v4, v1

    .line 135
    :goto_1
    invoke-static {}, La/a;->B()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 140
    .line 141
    const-string v3, "yyyy-MM-dd"

    .line 142
    .line 143
    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v4}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 165
    .line 166
    .line 167
    move-result-wide v1

    .line 168
    sub-long/2addr v3, v1

    .line 169
    const v1, 0x5265c00

    .line 170
    .line 171
    .line 172
    int-to-long v1, v1

    .line 173
    div-long/2addr v3, v1

    .line 174
    long-to-int v1, v3

    .line 175
    if-nez v1, :cond_6

    .line 176
    .line 177
    iget v1, p1, Ly4/a;->b:I

    .line 178
    .line 179
    if-ne v1, v5, :cond_6

    .line 180
    .line 181
    iget-object v1, v0, LY4/d;->j:Ly4/m;

    .line 182
    .line 183
    invoke-virtual {v0, p1, v1}, LY4/d;->b(Ly4/a;Ly4/m;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    :goto_2
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 187
    .line 188
    return-object p1

    .line 189
    :pswitch_2
    iget-object v0, p0, LY4/b;->r:LY4/d;

    .line 190
    .line 191
    iget-object v1, v0, LY4/d;->j:Ly4/m;

    .line 192
    .line 193
    iget v1, v1, Ly4/m;->a:I

    .line 194
    .line 195
    if-nez v1, :cond_7

    .line 196
    .line 197
    iget p1, p1, Ly4/a;->c:I

    .line 198
    .line 199
    const/16 v1, 0xb

    .line 200
    .line 201
    if-ne p1, v1, :cond_8

    .line 202
    .line 203
    invoke-virtual {v0}, LY4/d;->a()V

    .line 204
    .line 205
    .line 206
    goto :goto_3

    .line 207
    :cond_7
    const/4 v2, 0x1

    .line 208
    if-ne v1, v2, :cond_8

    .line 209
    .line 210
    iget v1, p1, Ly4/a;->b:I

    .line 211
    .line 212
    const/4 v3, 0x3

    .line 213
    if-ne v1, v3, :cond_8

    .line 214
    .line 215
    invoke-static {v2}, Ly4/m;->a(I)Ly4/l;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {v1}, Ly4/l;->a()Ly4/m;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v0, p1, v1}, LY4/d;->b(Ly4/a;Ly4/m;)V

    .line 224
    .line 225
    .line 226
    :cond_8
    :goto_3
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 227
    .line 228
    return-object p1

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
