.class public final synthetic LZ4/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/a;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LP/W;Landroid/webkit/WebView;LZ4/M;LP/W;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LZ4/z;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ4/z;->r:Ljava/lang/Object;

    iput-object p2, p0, LZ4/z;->t:Ljava/lang/Object;

    iput-object p3, p0, LZ4/z;->u:Ljava/lang/Object;

    iput-object p4, p0, LZ4/z;->s:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/work/impl/utils/WorkForegroundUpdater;Ljava/util/UUID;Landroidx/work/ForegroundInfo;Landroid/content/Context;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, LZ4/z;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ4/z;->r:Ljava/lang/Object;

    iput-object p2, p0, LZ4/z;->s:Ljava/lang/Object;

    iput-object p3, p0, LZ4/z;->t:Ljava/lang/Object;

    iput-object p4, p0, LZ4/z;->u:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LZ4/z;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ4/z;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroidx/work/impl/utils/WorkForegroundUpdater;

    .line 9
    .line 10
    iget-object v1, p0, LZ4/z;->s:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/UUID;

    .line 13
    .line 14
    iget-object v2, p0, LZ4/z;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Landroidx/work/ForegroundInfo;

    .line 17
    .line 18
    iget-object v3, p0, LZ4/z;->u:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Landroidx/work/impl/utils/WorkForegroundUpdater;->a(Landroidx/work/impl/utils/WorkForegroundUpdater;Ljava/util/UUID;Landroidx/work/ForegroundInfo;Landroid/content/Context;)Ljava/lang/Void;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :pswitch_0
    iget-object v0, p0, LZ4/z;->r:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, LP/W;

    .line 30
    .line 31
    iget-object v1, p0, LZ4/z;->t:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Landroid/webkit/WebView;

    .line 34
    .line 35
    iget-object v2, p0, LZ4/z;->u:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v2, LZ4/M;

    .line 38
    .line 39
    iget-object v3, p0, LZ4/z;->s:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v3, LP/W;

    .line 42
    .line 43
    invoke-interface {v0}, LP/S0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, LZ4/o;

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, LZ4/o;->b:LZ4/c;

    .line 53
    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, v0, LZ4/c;->a:Ljava/lang/String;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-interface {v3, v0}, LP/W;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    if-eqz v2, :cond_1

    .line 72
    .line 73
    const-string v0, ""

    .line 74
    .line 75
    invoke-virtual {v2, v0}, LZ4/M;->d(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
