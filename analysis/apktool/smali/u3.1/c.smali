.class public final Lu3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lu3/c;


# instance fields
.field public final a:Lr6/f;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lr6/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Lu3/c;

    .line 11
    .line 12
    invoke-direct {v2, v0, v1}, Lu3/c;-><init>(Lr6/f;Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    sput-object v2, Lu3/c;->c:Lu3/c;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lr6/f;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu3/c;->a:Lr6/f;

    .line 5
    .line 6
    iput-object p2, p0, Lu3/c;->b:Landroid/os/Looper;

    .line 7
    .line 8
    return-void
.end method
