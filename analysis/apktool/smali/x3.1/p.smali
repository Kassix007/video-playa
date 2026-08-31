.class public final Lx3/p;
.super Lx3/r;
.source "SourceFile"


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Landroid/content/Intent;

.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p4, p0, Lx3/p;->q:I

    iput-object p1, p0, Lx3/p;->r:Landroid/content/Intent;

    iput-object p2, p0, Lx3/p;->t:Ljava/lang/Object;

    iput p3, p0, Lx3/p;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget v0, p0, Lx3/p;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx3/p;->r:Landroid/content/Intent;

    .line 7
    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    iget-object v1, p0, Lx3/p;->t:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LJ1/q;

    .line 13
    .line 14
    iget-object v2, v1, LJ1/q;->I:LJ1/u;

    .line 15
    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {v1}, LJ1/q;->k()LJ1/H;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v3, v2, LJ1/H;->z:Le/g;

    .line 23
    .line 24
    iget v4, p0, Lx3/p;->s:I

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    new-instance v3, LJ1/E;

    .line 29
    .line 30
    iget-object v1, v1, LJ1/q;->u:Ljava/lang/String;

    .line 31
    .line 32
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v1, v3, LJ1/E;->q:Ljava/lang/String;

    .line 36
    .line 37
    iput v4, v3, LJ1/E;->r:I

    .line 38
    .line 39
    iget-object v1, v2, LJ1/H;->C:Ljava/util/ArrayDeque;

    .line 40
    .line 41
    invoke-virtual {v1, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v2, LJ1/H;->z:Le/g;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    iget-object v1, v2, LJ1/H;->t:LJ1/u;

    .line 51
    .line 52
    const/4 v2, -0x1

    .line 53
    if-ne v4, v2, :cond_1

    .line 54
    .line 55
    iget-object v1, v1, LJ1/u;->u:Lh/h;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "Starting activity with a requestCode requires a FragmentActivity host"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v3, "Fragment "

    .line 78
    .line 79
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, " not attached to Activity"

    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :cond_3
    :goto_0
    return-void

    .line 99
    :pswitch_0
    iget-object v0, p0, Lx3/p;->r:Landroid/content/Intent;

    .line 100
    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    iget-object v1, p0, Lx3/p;->t:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v1, Landroid/app/Activity;

    .line 106
    .line 107
    iget v2, p0, Lx3/p;->s:I

    .line 108
    .line 109
    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 110
    .line 111
    .line 112
    :cond_4
    return-void

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
