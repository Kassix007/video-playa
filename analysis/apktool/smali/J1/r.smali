.class public final synthetic LJ1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lh/h;


# direct methods
.method public synthetic constructor <init>(Lh/h;I)V
    .locals 0

    .line 1
    iput p2, p0, LJ1/r;->a:I

    iput-object p1, p0, LJ1/r;->b:Lh/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 5

    .line 1
    iget v0, p0, LJ1/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LJ1/r;->b:Lh/h;

    .line 12
    .line 13
    iget-object v1, v1, Lb/l;->y:Lb/j;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    iget-object v3, v1, Lb/j;->b:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    const-string v4, "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS"

    .line 30
    .line 31
    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ljava/util/Collection;

    .line 41
    .line 42
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 43
    .line 44
    .line 45
    const-string v3, "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS"

    .line 46
    .line 47
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 48
    .line 49
    .line 50
    new-instance v2, Ljava/util/ArrayList;

    .line 51
    .line 52
    iget-object v3, v1, Lb/j;->d:Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 55
    .line 56
    .line 57
    const-string v3, "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS"

    .line 58
    .line 59
    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 60
    .line 61
    .line 62
    new-instance v2, Landroid/os/Bundle;

    .line 63
    .line 64
    iget-object v1, v1, Lb/j;->g:Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-direct {v2, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 67
    .line 68
    .line 69
    const-string v1, "KEY_COMPONENT_ACTIVITY_PENDING_RESULT"

    .line 70
    .line 71
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_0
    :pswitch_0
    iget-object v0, p0, LJ1/r;->b:Lh/h;

    .line 76
    .line 77
    iget-object v1, v0, Lh/h;->K:Lk3/d;

    .line 78
    .line 79
    iget-object v1, v1, Lk3/d;->r:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, LJ1/u;

    .line 82
    .line 83
    iget-object v1, v1, LJ1/u;->w:LJ1/H;

    .line 84
    .line 85
    invoke-static {v1}, Lh/h;->m(LJ1/H;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-nez v1, :cond_0

    .line 90
    .line 91
    iget-object v0, v0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 92
    .line 93
    sget-object v1, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, Landroid/os/Bundle;

    .line 99
    .line 100
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 101
    .line 102
    .line 103
    return-object v0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
