.class public abstract Lv0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lv0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lv0/f;

    .line 2
    .line 3
    sget-object v1, Ln5/s;->q:Ln5/s;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lv0/f;-><init>(Ljava/util/List;Lcom/google/android/gms/internal/measurement/O1;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lv0/u;->a:Lv0/f;

    .line 10
    .line 11
    return-void
.end method

.method public static final a(Lc0/m;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Lc0/m;
    .locals 3

    .line 1
    new-instance v0, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x6

    .line 5
    invoke-direct {v0, p1, v1, p2, v2}, Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;-><init>(Ljava/lang/Object;Ll6/d;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;I)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
