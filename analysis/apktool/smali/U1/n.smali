.class public final LU1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/E;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La0/q;Ljava/lang/Object;Lt/l;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LU1/n;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LU1/n;->d:Ljava/lang/Object;

    iput-object p2, p0, LU1/n;->b:Ljava/lang/Object;

    iput-object p3, p0, LU1/n;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LU1/n;->a:I

    iput-object p1, p0, LU1/n;->b:Ljava/lang/Object;

    iput-object p2, p0, LU1/n;->c:Ljava/lang/Object;

    iput-object p3, p0, LU1/n;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget v0, p0, LU1/n;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU1/n;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La0/q;

    .line 9
    .line 10
    iget-object v1, p0, LU1/n;->b:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, La0/q;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LU1/n;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lt/l;

    .line 18
    .line 19
    iget-object v0, v0, Lt/l;->d:Lr/G;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lr/G;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object v0, p0, LU1/n;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, LZ/f;

    .line 28
    .line 29
    iget-object v1, v0, LZ/f;->b:Lr/G;

    .line 30
    .line 31
    iget-object v2, p0, LU1/n;->c:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lr/G;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v3, p0, LU1/n;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v3, LZ/i;

    .line 40
    .line 41
    if-ne v1, v3, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, LZ/f;->a:Ljava/util/Map;

    .line 44
    .line 45
    invoke-interface {v3}, LZ/i;->b()Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_1
    :goto_0
    return-void

    .line 63
    :pswitch_1
    iget-object v0, p0, LU1/n;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, LU1/r;

    .line 66
    .line 67
    iget-object v1, p0, LU1/n;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LT1/d;

    .line 70
    .line 71
    invoke-virtual {v0}, LT1/z;->b()LT1/h;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0, v1}, LT1/h;->c(LT1/d;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, LU1/n;->d:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, La0/q;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, La0/q;->remove(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
