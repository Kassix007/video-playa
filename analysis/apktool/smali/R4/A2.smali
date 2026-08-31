.class public final LR4/A2;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public q:Lcom/web2native/MainActivity;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Lcom/web2native/MainActivity;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR4/A2;->u:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LR4/A2;->v:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    iput-object p3, p0, LR4/A2;->w:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, LR4/A2;->x:Ljava/lang/String;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ls5/i;-><init>(ILq5/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 6

    .line 1
    new-instance v0, LR4/A2;

    .line 2
    .line 3
    iget-object v3, p0, LR4/A2;->w:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v4, p0, LR4/A2;->x:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, LR4/A2;->u:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, LR4/A2;->v:Lcom/web2native/MainActivity;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LR4/A2;-><init>(Ljava/lang/String;Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, LR4/A2;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LR4/A2;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LR4/A2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    const-string v0, "the error is "

    .line 2
    .line 3
    iget v1, p0, LR4/A2;->t:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    sget-object v5, Lr5/a;->q:Lr5/a;

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v4, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, LR4/A2;->s:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, LR4/A2;->r:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v3, p0, LR4/A2;->q:Lcom/web2native/MainActivity;

    .line 21
    .line 22
    :try_start_0
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto/16 :goto_5

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    :try_start_1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :try_start_2
    iget-object p1, p0, LR4/A2;->u:Ljava/lang/String;

    .line 45
    .line 46
    iput v4, p0, LR4/A2;->t:I

    .line 47
    .line 48
    sget-object v1, LM5/H;->a:LT5/e;

    .line 49
    .line 50
    sget-object v1, LT5/d;->q:LT5/d;

    .line 51
    .line 52
    new-instance v6, LR4/C2;

    .line 53
    .line 54
    invoke-direct {v6, p1, v3}, LR4/C2;-><init>(Ljava/lang/String;Lq5/c;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v6, p0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v5, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    :goto_0
    check-cast p1, [B

    .line 65
    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    iget-object v1, p0, LR4/A2;->v:Lcom/web2native/MainActivity;

    .line 69
    .line 70
    iget-object v6, p0, LR4/A2;->w:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v7, p0, LR4/A2;->x:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v1, v6}, LR4/V;->f(Lcom/web2native/MainActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    iput-object v1, p0, LR4/A2;->q:Lcom/web2native/MainActivity;

    .line 79
    .line 80
    iput-object v6, p0, LR4/A2;->r:Ljava/lang/String;

    .line 81
    .line 82
    iput-object v7, p0, LR4/A2;->s:Ljava/lang/String;

    .line 83
    .line 84
    iput v2, p0, LR4/A2;->t:I

    .line 85
    .line 86
    sget-object v2, LM5/H;->a:LT5/e;

    .line 87
    .line 88
    sget-object v2, LT5/d;->q:LT5/d;

    .line 89
    .line 90
    new-instance v9, LR4/D2;

    .line 91
    .line 92
    invoke-direct {v9, v1, v8, p1, v3}, LR4/D2;-><init>(Lcom/web2native/MainActivity;Ljava/lang/String;[BLq5/c;)V

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v9, p0}, LM5/y;->B(Lq5/h;LB5/e;Lq5/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v5, :cond_4

    .line 100
    .line 101
    :goto_1
    return-object v5

    .line 102
    :cond_4
    move-object v3, v1

    .line 103
    move-object v2, v6

    .line 104
    move-object v1, v7

    .line 105
    :goto_2
    check-cast p1, Ljava/io/File;

    .line 106
    .line 107
    if-eqz p1, :cond_7

    .line 108
    .line 109
    const-string v5, "com.wnapp.smspariaz.provider"

    .line 110
    .line 111
    invoke-static {v3, v5, p1}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 112
    .line 113
    .line 114
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 115
    :try_start_3
    new-instance v5, Landroid/content/Intent;

    .line 116
    .line 117
    const-string v6, "android.intent.action.SEND"

    .line 118
    .line 119
    invoke-direct {v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    if-eqz v1, :cond_5

    .line 123
    .line 124
    invoke-static {v1}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    xor-int/2addr v6, v4

    .line 129
    if-ne v6, v4, :cond_5

    .line 130
    .line 131
    const-string v6, "android.intent.extra.TEXT"

    .line 132
    .line 133
    invoke-virtual {v5, v6, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :catch_1
    move-exception p1

    .line 138
    goto :goto_4

    .line 139
    :cond_5
    :goto_3
    const-string v1, "android.intent.extra.STREAM"

    .line 140
    .line 141
    invoke-virtual {v5, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    if-nez v2, :cond_6

    .line 145
    .line 146
    const-string v2, "*/*"

    .line 147
    .line 148
    :cond_6
    invoke-static {v2}, LD5/a;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {v5, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    const/high16 p1, 0x10000000

    .line 159
    .line 160
    invoke-virtual {v5, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 161
    .line 162
    .line 163
    const-string p1, "Share File"

    .line 164
    .line 165
    invoke-static {v5, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {v3, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 170
    .line 171
    .line 172
    goto :goto_6

    .line 173
    :goto_4
    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 186
    .line 187
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 188
    .line 189
    .line 190
    goto :goto_6

    .line 191
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    const-string v1, "the error = "

    .line 194
    .line 195
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 206
    .line 207
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    :cond_7
    :goto_6
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 211
    .line 212
    return-object p1
.end method
