.class public final Lh0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lh0/m;

.field public static final c:Lh0/m;

.field public static final d:Lh0/m;


# instance fields
.field public final a:LR/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lh0/m;

    .line 2
    .line 3
    invoke-direct {v0}, Lh0/m;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh0/m;->b:Lh0/m;

    .line 7
    .line 8
    new-instance v0, Lh0/m;

    .line 9
    .line 10
    invoke-direct {v0}, Lh0/m;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lh0/m;->c:Lh0/m;

    .line 14
    .line 15
    new-instance v0, Lh0/m;

    .line 16
    .line 17
    invoke-direct {v0}, Lh0/m;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lh0/m;->d:Lh0/m;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LR/e;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    new-array v1, v1, [LB0/d;

    .line 9
    .line 10
    invoke-direct {v0, v1}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lh0/m;->a:LR/e;

    .line 14
    .line 15
    return-void
.end method
