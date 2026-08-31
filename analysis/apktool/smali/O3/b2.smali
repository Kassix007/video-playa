.class public final LO3/b2;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final a:LO3/t0;


# direct methods
.method public constructor <init>(LO3/t0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO3/b2;->a:LO3/t0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    iget-object p1, p0, LO3/b2;->a:LO3/t0;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, LO3/t0;->v:LO3/X;

    .line 6
    .line 7
    invoke-static {p1}, LO3/t0;->l(LO3/E0;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, LO3/X;->z:LO3/V;

    .line 11
    .line 12
    const-string p2, "App receiver called with null intent"

    .line 13
    .line 14
    invoke-virtual {p1, p2}, LO3/V;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, LO3/t0;->v:LO3/X;

    .line 25
    .line 26
    invoke-static {p1}, LO3/t0;->l(LO3/E0;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, LO3/X;->z:LO3/V;

    .line 30
    .line 31
    const-string p2, "App receiver called with null action"

    .line 32
    .line 33
    invoke-virtual {p1, p2}, LO3/V;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const v1, -0x72ee9a21

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    if-eq v0, v1, :cond_3

    .line 46
    .line 47
    const v1, 0x4c497878    # 5.2814304E7f

    .line 48
    .line 49
    .line 50
    if-eq v0, v1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const-string v0, "com.google.android.gms.measurement.BATCHES_AVAILABLE"

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_4

    .line 60
    .line 61
    move p2, v2

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const-string v0, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 64
    .line 65
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    if-eqz p2, :cond_4

    .line 70
    .line 71
    const/4 p2, 0x0

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    :goto_0
    const/4 p2, -0x1

    .line 74
    :goto_1
    if-eqz p2, :cond_6

    .line 75
    .line 76
    if-eq p2, v2, :cond_5

    .line 77
    .line 78
    iget-object p1, p1, LO3/t0;->v:LO3/X;

    .line 79
    .line 80
    invoke-static {p1}, LO3/t0;->l(LO3/E0;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p1, LO3/X;->z:LO3/V;

    .line 84
    .line 85
    const-string p2, "App receiver called with unknown action"

    .line 86
    .line 87
    invoke-virtual {p1, p2}, LO3/V;->b(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_5
    iget-object p2, p1, LO3/t0;->v:LO3/X;

    .line 92
    .line 93
    invoke-static {p2}, LO3/t0;->l(LO3/E0;)V

    .line 94
    .line 95
    .line 96
    iget-object p2, p2, LO3/X;->E:LO3/V;

    .line 97
    .line 98
    const-string v0, "[sgtm] App Receiver notified batches are available"

    .line 99
    .line 100
    invoke-virtual {p2, v0}, LO3/V;->b(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p1, LO3/t0;->w:LO3/p0;

    .line 104
    .line 105
    invoke-static {p1}, LO3/t0;->l(LO3/E0;)V

    .line 106
    .line 107
    .line 108
    new-instance p2, LA1/b;

    .line 109
    .line 110
    const/16 v0, 0xb

    .line 111
    .line 112
    invoke-direct {p2, v0, p0}, LA1/b;-><init>(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/measurement/Y3;->a()V

    .line 120
    .line 121
    .line 122
    iget-object p2, p1, LO3/t0;->t:LO3/g;

    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    sget-object v1, LO3/F;->Q0:LO3/E;

    .line 126
    .line 127
    invoke-virtual {p2, v0, v1}, LO3/g;->y(Ljava/lang/String;LO3/E;)Z

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-nez p2, :cond_7

    .line 132
    .line 133
    return-void

    .line 134
    :cond_7
    iget-object p2, p1, LO3/t0;->v:LO3/X;

    .line 135
    .line 136
    invoke-static {p2}, LO3/t0;->l(LO3/E0;)V

    .line 137
    .line 138
    .line 139
    iget-object p2, p2, LO3/X;->E:LO3/V;

    .line 140
    .line 141
    const-string v0, "App receiver notified triggers are available"

    .line 142
    .line 143
    invoke-virtual {p2, v0}, LO3/V;->b(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object p2, p1, LO3/t0;->w:LO3/p0;

    .line 147
    .line 148
    invoke-static {p2}, LO3/t0;->l(LO3/E0;)V

    .line 149
    .line 150
    .line 151
    new-instance v0, LA1/b;

    .line 152
    .line 153
    const/16 v1, 0xc

    .line 154
    .line 155
    invoke-direct {v0, v1, p1}, LA1/b;-><init>(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, v0}, LO3/p0;->x(Ljava/lang/Runnable;)V

    .line 159
    .line 160
    .line 161
    return-void
.end method
