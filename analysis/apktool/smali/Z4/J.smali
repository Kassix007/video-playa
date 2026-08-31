.class public final LZ4/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic q:LP/W;

.field public final synthetic r:Landroid/webkit/WebView;

.field public final synthetic s:LZ4/M;

.field public final synthetic t:LP/W;


# direct methods
.method public constructor <init>(LP/W;Landroid/webkit/WebView;LZ4/M;LP/W;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ4/J;->q:LP/W;

    .line 5
    .line 6
    iput-object p2, p0, LZ4/J;->r:Landroid/webkit/WebView;

    .line 7
    .line 8
    iput-object p3, p0, LZ4/J;->s:LZ4/M;

    .line 9
    .line 10
    iput-object p4, p0, LZ4/J;->t:LP/W;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Lv0/o;Lq5/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, LW1/e;

    .line 2
    .line 3
    const/4 v5, 0x2

    .line 4
    iget-object v1, p0, LZ4/J;->q:LP/W;

    .line 5
    .line 6
    iget-object v2, p0, LZ4/J;->r:Landroid/webkit/WebView;

    .line 7
    .line 8
    iget-object v3, p0, LZ4/J;->s:LZ4/M;

    .line 9
    .line 10
    iget-object v4, p0, LZ4/J;->t:LP/W;

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, LW1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x7

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {p1, v2, v0, p2, v1}, Lw/g1;->d(Lv0/o;LB5/c;LB5/c;Lq5/c;I)Ljava/lang/Object;

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
    return-object p1

    .line 26
    :cond_0
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 27
    .line 28
    return-object p1
.end method
