.class public abstract Ll0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LW0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LW0/d;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-direct {v0, v1, v1}, LW0/d;-><init>(FF)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ll0/c;->a:LW0/d;

    .line 9
    .line 10
    return-void
.end method
